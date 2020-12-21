package Interface;

import Model.Car;
import java.util.List;

public interface CarInterface {
    public boolean insert(Car c);
    public boolean update(Car c);
    public boolean delete(Car c);
    public List<Car> getAllCar();
    
}
