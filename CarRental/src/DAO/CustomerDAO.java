package DAO;

import Interface.CustomerInterface;
import Model.Customer;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CustomerDAO implements CustomerInterface{

    @Override
    public boolean insert(Customer c) {
        String sql = "INSERT INTO customer(nik, name, place, date, phone, sex) VALUES(?,?,?,?,?,?)";
        try {
            PreparedStatement st = Koneksi.open().prepareStatement(sql);
            st.setString(1, c.getNik());
            st.setString(2, c.getName());
            st.setString(3, c.getPlace());
            st.setString(4, c.getDate());
            st.setString(5, c.getPhone());
            st.setString(6, c.getSex());
            int hasil = st.executeUpdate();
            if(hasil>0){
                return true;
            }
            st.close();
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean update(Customer c) {
        String sql = "UPDATE customer SET nik=?, name=?, place=?, date=?, phone=?, sex=? WHERE id=?";
        try {
            PreparedStatement st = Koneksi.open().prepareStatement(sql);
            st.setString(1, c.getNik());
            st.setString(2, c.getName());
            st.setString(3, c.getPlace());
            st.setString(4, c.getDate());
            st.setString(5, c.getPhone());
            st.setString(6, c.getSex());
            st.setInt(7, c.getId());
            int hasil = st.executeUpdate();
            if(hasil>0){
                return true;
            }
            st.close();
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean delete(Customer c) {
        String sql = "DELETE FROM customer WHERE id=?";
        try {
            PreparedStatement st = Koneksi.open().prepareStatement(sql);
            st.setInt(1, c.getId());
            int hasil = st.executeUpdate();
            if(hasil>0){
                return true;
            }
            st.close();
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public List<Customer> getAllCustomer() {
        List<Customer> customers = new ArrayList<>();
        String sql = "SELECT * FROM customer";
        try {
            PreparedStatement st = Koneksi.open().prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                Customer c = new Customer(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7));
                customers.add(c);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return customers;
    }    
}
