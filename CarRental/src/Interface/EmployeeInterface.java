package Interface;

import Model.Employee;
import View.HalamanAdmin;
import View.HalamanKaryawan;
import View.HalamanLogin;
import java.util.List;

public interface EmployeeInterface {
    public boolean insert(Employee e);
    public boolean update(Employee e);
    public boolean delete(Employee e);
    public List<Employee> getAllEmployee();
    public boolean verifikasi(Employee e);
    public void login(HalamanLogin hl, Employee e);
    public void logout(HalamanAdmin ha);
    public void logout(HalamanKaryawan hk);
}
