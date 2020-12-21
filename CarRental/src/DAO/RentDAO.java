package DAO;

import Interface.RentInterface;
import Model.Rent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RentDAO implements RentInterface{

    @Override
    public boolean insert(Rent r) {
        String sql = "INSERT INTO rent(customer, car, start, duration, finish, total) VALUES(?,?,?,?,?,?)";
        try {
            PreparedStatement st = Koneksi.open().prepareStatement(sql);
            st.setInt(1, r.getCustomer());
            st.setInt(2, r.getCar());
            st.setString(3, r.getStart());
            st.setInt(4, r.getDuration());
            st.setString(5, r.getFinish());
            st.setInt(6, r.getTotal());
            int hasil = st.executeUpdate();
            if(hasil>0){
                return true;
            }
            st.close();
        } catch (SQLException ex) {
            Logger.getLogger(RentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean update(Rent r) {
        String sql = "UPDATE rent SET customer=?, car=?, start=?, duration=?, finish=?, total=? WHERE id=?";
        try {
            PreparedStatement st = Koneksi.open().prepareStatement(sql);
            st.setInt(1, r.getCustomer());
            st.setInt(2, r.getCar());
            st.setString(3, r.getStart());
            st.setInt(4, r.getDuration());
            st.setString(5, r.getFinish());
            st.setInt(6, r.getTotal());
            st.setInt(7, r.getId());
            int hasil = st.executeUpdate();
            if(hasil>0){
                return true;
            }
            st.close();
        } catch (SQLException ex) {
            Logger.getLogger(RentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean delete(Rent r) {
        String sql = "DELETE FROM rent WHERE id=?";
        try {
            PreparedStatement st = Koneksi.open().prepareStatement(sql);
            st.setInt(1, r.getId());
            int hasil = st.executeUpdate();
            if(hasil>0){
                return true;
            }
            st.close();
        } catch (SQLException ex) {
            Logger.getLogger(RentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public List<Rent> getAllRent() {
        List<Rent> rents = new ArrayList<>();
        String sql = "SELECT * FROM rent";
        try {
            PreparedStatement st = Koneksi.open().prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                Rent r = new Rent(rs.getInt(1),rs.getInt(2),rs.getInt(3),rs.getString(4),rs.getInt(5),rs.getString(6),rs.getInt(7));
                rents.add(r);
            }
        } catch (SQLException ex) {
            Logger.getLogger(RentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rents;
    }
    
}
