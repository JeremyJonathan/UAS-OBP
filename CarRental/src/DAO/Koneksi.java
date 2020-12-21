package DAO;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Koneksi {
    private static java.sql.Connection kon;
    private static final String URL = "jdbc:mysql://localhost/car_rental";
    private static final String DRIVERNAME = "com.mysql.jdbc.Driver";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    
    public static java.sql.Connection open(){
        if(kon==null){
            try {
                Class.forName(DRIVERNAME);                
                try {
                    kon = (com.mysql.jdbc.Connection)DriverManager.getConnection(URL, USERNAME, PASSWORD);
                } catch (SQLException ex1) {
                    System.out.println("CONNECTED");
                }
            } catch (ClassNotFoundException ex) {
                System.out.println("DRIVER NOT FOUND "+ex);
            }            
        }
        return kon;
    }
    
    public static java.sql.Connection close(){
        if(kon==null){
            try {
                kon.close();
            } catch (SQLException ex) {
                System.out.println("ERROR : "+ex);
            }
        }
        return kon;
    }
    
    public static void main(String[] args){
        new Koneksi();
    }
    
}
