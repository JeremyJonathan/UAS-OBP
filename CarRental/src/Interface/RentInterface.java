package Interface;

import Model.Rent;
import java.util.List;

public interface RentInterface {
    public boolean insert(Rent r);
    public boolean update(Rent r);
    public boolean delete(Rent r);
    public List<Rent> getAllRent();
}
