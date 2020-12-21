package Interface;

import Model.Customer;
import java.util.List;

public interface CustomerInterface {
    public boolean insert(Customer c);
    public boolean update(Customer c);
    public boolean delete(Customer c);
    public List<Customer> getAllCustomer();
    
}
