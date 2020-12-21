package DAO;

import Interface.CarInterface;
import Model.Car;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CarDAO implements CarInterface{ 

    @Override
    public boolean insert(Car c) {
        String sql = "INSERT INTO car(nopol, merk, price) VALUES(?,?,?)";
        try {
            PreparedStatement st = Koneksi.open().prepareStatement(sql);
            st.setString(1, c.getNopol());
            st.setString(2, c.getMerk());
            st.setInt(3, c.getPrice());
            int hasil = st.executeUpdate();
            if(hasil>0){
                return true;
            }
            st.close();
        } catch (SQLException ex) {
            Logger.getLogger(CarDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean update(Car c) {
        String sql = "UPDATE car SET nopol=?, merk=?, price=? WHERE id=?";
        try {
            PreparedStatement st = Koneksi.open().prepareStatement(sql);
            st.setString(1, c.getNopol());
            st.setString(2, c.getMerk());
            st.setInt(3, c.getPrice());
            st.setInt(4, c.getId());
            System.out.println(st);
            int hasil = st.executeUpdate();
            if(hasil>0){
                return true;
            }
            st.close();
        } catch (SQLException ex) {
            Logger.getLogger(CarDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean delete(Car c) {
        String sql = "DELETE FROM car WHERE id=?";
        try {
            PreparedStatement st = Koneksi.open().prepareStatement(sql);
            st.setInt(1, c.getId());
            int hasil = st.executeUpdate();
            if(hasil>0){
                return true;
            }
            st.close();
        } catch (SQLException ex) {
            Logger.getLogger(CarDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public List<Car> getAllCar() {
        List<Car> cars = new ArrayList<>();
        String sql = "SELECT * FROM car";
        try {
            PreparedStatement st = Koneksi.open().prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                Car u = new Car(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4));
                cars.add(u);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CarDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cars;
    }
    
}
