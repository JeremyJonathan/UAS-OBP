package Controller;

import DAO.CustomerDAO;
import Interface.CustomerInterface;
import Model.CRUD;
import Model.Customer;
import java.util.List;
import java.util.Observable;

public class CustomerController extends Observable{
    private CustomerInterface dao = new CustomerDAO();
    private CRUD c;
    
    private void setDAO(CustomerInterface dao){
        this.dao = dao;
    }
    
    public boolean setDML(Customer r, CRUD c){
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
    
    public List<Customer> getAllCustomer(){
        return dao.getAllCustomer();
    }
}
