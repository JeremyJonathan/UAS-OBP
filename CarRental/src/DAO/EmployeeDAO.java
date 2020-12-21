package DAO;

import Interface.EmployeeInterface;
import Model.Employee;
import View.HalamanAdmin;
import View.HalamanKaryawan;
import View.HalamanLogin;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EmployeeDAO implements EmployeeInterface{

    @Override
    public boolean insert(Employee e) {
        String sql = "INSERT INTO employee(uname, pswd, name, email, role) VALUES(?,?,?,?,?)";
        try {
            PreparedStatement st = Koneksi.open().prepareStatement(sql);
            st.setString(1, e.getUname());
            st.setString(2, e.getPswd());
            st.setString(3, e.getName());
            st.setString(4, e.getEmail());
            st.setInt(5, e.getRole());
            int hasil = st.executeUpdate();
            if(hasil>0){
                return true;
            }
            st.close();
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean update(Employee e) {
        String sql = "UPDATE employee SET uname=?, pswd=?, name=?, email=?, role=? WHERE id=?";
        try {
            PreparedStatement st = Koneksi.open().prepareStatement(sql);
            st.setString(1, e.getUname());
            st.setString(2, e.getPswd());
            st.setString(3, e.getName());
            st.setString(4, e.getEmail());
            st.setInt(5, e.getRole());
            st.setInt(6, e.getId());
            int hasil = st.executeUpdate();
            if(hasil>0){
                return true;
            }
            st.close();
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean delete(Employee e) {
        String sql = "DELETE FROM employee WHERE id=?";
        try {
            PreparedStatement st = Koneksi.open().prepareStatement(sql);
            st.setInt(1, e.getId());
            int hasil = st.executeUpdate();
            if(hasil>0){
                return true;
            }
            st.close();
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public List<Employee> getAllEmployee() {
        List<Employee> employees = new ArrayList<>();
        String sql = "SELECT * FROM employee";
        try {
            PreparedStatement st = Koneksi.open().prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                Employee e = new Employee(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getInt(6));
                employees.add(e);
            }
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return employees;
    }
    
    
    @Override
    public void login(HalamanLogin hl, Employee e) {
        hl.dispose();
        if(e.getRole() == 0){
            HalamanAdmin ha = new HalamanAdmin();
            ha.setVisible(true);
        }else{
            HalamanKaryawan hk = new HalamanKaryawan();
            hk.setVisible(true);
        }
    }

    @Override
    public boolean verifikasi(Employee e) {
        String sql = "SELECT * FROM employee WHERE uname='"+e.getUname()+"' AND pswd='"+e.getPswd()+"'";
        try {
            Statement st = Koneksi.open().createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next()){
                String id = rs.getString("id");
                e.setId(Integer.valueOf(id));
                e.setRole(Integer.valueOf(rs.getString("role")));
                return true;
            }
            rs.close();
            st.close();
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;        
    }

    @Override
    public void logout(HalamanAdmin ha) {
        ha.dispose();
        HalamanLogin hl = new HalamanLogin();
        hl.setVisible(true);
    }

    @Override
    public void logout(HalamanKaryawan hk) {
        hk.dispose();
        HalamanLogin hl = new HalamanLogin();
        hl.setVisible(true);
    }
    
}
