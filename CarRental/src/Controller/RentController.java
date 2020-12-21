package Controller;

import DAO.RentDAO;
import Interface.RentInterface;
import Model.CRUD;
import Model.Rent;
import java.util.List;
import java.util.Observable;

public class RentController extends Observable{
    private RentInterface dao = new RentDAO();
    private CRUD c;
    
    private void setDAO(RentInterface dao){
        this.dao = dao;
    }
    
    public boolean setDML(Rent r, CRUD c){
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
    
    public List<Rent> getAllRent(){
        return dao.getAllRent();
    }
    
}
