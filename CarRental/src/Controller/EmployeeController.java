package Controller;

import DAO.EmployeeDAO;
import Interface.EmployeeInterface;
import Model.CRUD;
import Model.Employee;
import View.HalamanAdmin;
import View.HalamanKaryawan;
import View.HalamanLogin;
import java.util.List;
import java.util.Observable;
import javax.swing.JOptionPane;

public class EmployeeController extends Observable{
    private EmployeeInterface dao = new EmployeeDAO();
    private CRUD c;
    
    private void setDAO(EmployeeInterface dao){
        this.dao = dao;
    }
    
    public boolean setDML(Employee r, CRUD c){
        boolean hasil = false;
        this.c = c;
        switch(c){
            case INSERT : hasil = dao.insert(r); break;
            case UPDATE : hasil = dao.update(r); break;
            case DELETE : hasil = dao.delete(r); break;
        }
        setChanged();
        if(hasil){
            notifyObservers(r);
        }else{
            notifyObservers();
        }
        return hasil;
    }
    
    public List<Employee> getAllEmployee(){
        return dao.getAllEmployee();
    }
    
    public void login(HalamanLogin hl, Employee e){
        if(dao.verifikasi(e)) dao.login(hl, e);
        else JOptionPane.showMessageDialog(hl, "Your account is not registered");
    }
    
    public void logout(HalamanAdmin ha){
        dao.logout(ha);
    }
    
    public void logout(HalamanKaryawan hk){
        dao.logout(hk);
    }
    
    
}
