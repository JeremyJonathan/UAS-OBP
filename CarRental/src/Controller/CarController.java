
package Controller;

import DAO.CarDAO;
import Interface.CarInterface;
import Model.CRUD;
import Model.Car;
import java.util.List;
import java.util.Observable;

public class CarController extends Observable{
    private CarInterface dao = new CarDAO();
    private CRUD c;
    
    private void setDAO(CarInterface dao){
        this.dao = dao;
    }
    
    public boolean setDML(Car r, CRUD c){
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
    
    public List<Car> getAllCar(){
        return dao.getAllCar();
    }
}
