package View;
import Controller.CarController;
import Controller.CustomerController;
import Controller.RentController;
import Controller.EmployeeController;
import Model.CRUD;
import Model.Car;
import Model.Customer;
import Model.Rent;
import Model.Employee;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HalamanAdmin extends javax.swing.JFrame {

    
    DefaultTableModel tableModel;
    CarController carController = new CarController();
    CustomerController customerController = new CustomerController();
    EmployeeController employeeController = new EmployeeController();
    RentController rentController = new RentController();
    private static final DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    private int carId, customerId, rentId, employeeId;
    
    public HalamanAdmin() {
        initComponents();
        setVisibleCar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MenuPanel = new javax.swing.JPanel();
        car_btn_menu = new javax.swing.JButton();
        employee_btn_menu = new javax.swing.JButton();
        customer_btn_menu = new javax.swing.JButton();
        rent_btn_menu = new javax.swing.JButton();
        logout_btn_menu = new javax.swing.JButton();
        TitlePanel = new javax.swing.JPanel();
        PageTitle = new javax.swing.JLabel();
        FormPanel = new javax.swing.JPanel();
        CarForm = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nopol_tf_car = new javax.swing.JTextField();
        merk_tf_car = new javax.swing.JTextField();
        price_tf_car = new javax.swing.JTextField();
        create_btn_car = new javax.swing.JButton();
        update_btn_car = new javax.swing.JButton();
        delete_btn_car = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        CustomerForm = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        nik_tf_customer = new javax.swing.JTextField();
        name_tf_customer = new javax.swing.JTextField();
        place_tf_customer = new javax.swing.JTextField();
        create_btn_customer = new javax.swing.JButton();
        update_btn_customer = new javax.swing.JButton();
        delete_btn_customer = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        date_tf_customer = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        phone_tf_customer = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        sex_cb_customer = new javax.swing.JComboBox<>();
        EmployeeForm = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        uname_tf_employee = new javax.swing.JTextField();
        pswd_tf_employee = new javax.swing.JTextField();
        name_tf_employee = new javax.swing.JTextField();
        create_btn_employee = new javax.swing.JButton();
        update_btn_employee = new javax.swing.JButton();
        delete_btn_employee = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        email_tf_employee = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        role_cb_employee = new javax.swing.JComboBox<>();
        RentForm = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        finish_tf_rent = new javax.swing.JTextField();
        total_tf_rent = new javax.swing.JTextField();
        start_tf_rent = new javax.swing.JTextField();
        create_btn_rent = new javax.swing.JButton();
        update_btn_rent = new javax.swing.JButton();
        delete_btn_rent = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        duration_tf_rent = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        customer_cb_rent = new javax.swing.JComboBox<>();
        calculate_btn_rent = new javax.swing.JButton();
        car_cb_rent = new javax.swing.JComboBox<>();
        TablePanel = new javax.swing.JPanel();
        EmployeeTablePanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        EmployeeTable = new javax.swing.JTable();
        CustomerTablePanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        CustomerTable = new javax.swing.JTable();
        CarTablePanel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        CarTable = new javax.swing.JTable();
        RentTablePanel = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        RentTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MenuPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        car_btn_menu.setText("Car");
        car_btn_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                car_btn_menuActionPerformed(evt);
            }
        });

        employee_btn_menu.setText("Employee");
        employee_btn_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employee_btn_menuActionPerformed(evt);
            }
        });

        customer_btn_menu.setText("Customer");
        customer_btn_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customer_btn_menuActionPerformed(evt);
            }
        });

        rent_btn_menu.setText("Rent");
        rent_btn_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rent_btn_menuActionPerformed(evt);
            }
        });

        logout_btn_menu.setText("Logout");
        logout_btn_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout_btn_menuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MenuPanelLayout = new javax.swing.GroupLayout(MenuPanel);
        MenuPanel.setLayout(MenuPanelLayout);
        MenuPanelLayout.setHorizontalGroup(
            MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(car_btn_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(customer_btn_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(rent_btn_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(employee_btn_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(logout_btn_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        MenuPanelLayout.setVerticalGroup(
            MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(logout_btn_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customer_btn_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(car_btn_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rent_btn_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(employee_btn_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TitlePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        PageTitle.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        PageTitle.setText("Page Title");

        javax.swing.GroupLayout TitlePanelLayout = new javax.swing.GroupLayout(TitlePanel);
        TitlePanel.setLayout(TitlePanelLayout);
        TitlePanelLayout.setHorizontalGroup(
            TitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TitlePanelLayout.createSequentialGroup()
                .addGap(593, 593, 593)
                .addComponent(PageTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TitlePanelLayout.setVerticalGroup(
            TitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TitlePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PageTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        FormPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setText("No Polisi");

        jLabel3.setText("Merk");

        jLabel4.setText("Price");

        create_btn_car.setText("Create");
        create_btn_car.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                create_btn_carActionPerformed(evt);
            }
        });

        update_btn_car.setText("Update");
        update_btn_car.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_btn_carActionPerformed(evt);
            }
        });

        delete_btn_car.setText("Delete");
        delete_btn_car.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_btn_carActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Car Form");

        javax.swing.GroupLayout CarFormLayout = new javax.swing.GroupLayout(CarForm);
        CarForm.setLayout(CarFormLayout);
        CarFormLayout.setHorizontalGroup(
            CarFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CarFormLayout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(CarFormLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CarFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CarFormLayout.createSequentialGroup()
                        .addGroup(CarFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(CarFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(price_tf_car, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(merk_tf_car, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nopol_tf_car)))
                    .addGroup(CarFormLayout.createSequentialGroup()
                        .addComponent(create_btn_car)
                        .addGap(46, 46, 46)
                        .addComponent(update_btn_car)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addComponent(delete_btn_car)))
                .addContainerGap())
        );
        CarFormLayout.setVerticalGroup(
            CarFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CarFormLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(23, 23, 23)
                .addGroup(CarFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nopol_tf_car, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(CarFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(merk_tf_car, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(CarFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(price_tf_car, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(CarFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(create_btn_car, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(update_btn_car, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete_btn_car, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(291, Short.MAX_VALUE))
        );

        jLabel6.setText("NIK");

        jLabel7.setText("Name");

        jLabel8.setText("Place");

        create_btn_customer.setText("Create");
        create_btn_customer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                create_btn_customerActionPerformed(evt);
            }
        });

        update_btn_customer.setText("Update");
        update_btn_customer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_btn_customerActionPerformed(evt);
            }
        });

        delete_btn_customer.setText("Delete");
        delete_btn_customer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_btn_customerActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Customer Form");

        jLabel10.setText("Date");

        jLabel11.setText("Phone");

        jLabel12.setText("Sex");

        sex_cb_customer.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        javax.swing.GroupLayout CustomerFormLayout = new javax.swing.GroupLayout(CustomerForm);
        CustomerForm.setLayout(CustomerFormLayout);
        CustomerFormLayout.setHorizontalGroup(
            CustomerFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CustomerFormLayout.createSequentialGroup()
                .addGroup(CustomerFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CustomerFormLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(create_btn_customer)
                        .addGap(46, 46, 46)
                        .addComponent(update_btn_customer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                        .addComponent(delete_btn_customer))
                    .addGroup(CustomerFormLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(CustomerFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CustomerFormLayout.createSequentialGroup()
                                .addGroup(CustomerFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addGap(18, 18, 18)
                                .addGroup(CustomerFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(place_tf_customer, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(name_tf_customer, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(nik_tf_customer)))
                            .addGroup(CustomerFormLayout.createSequentialGroup()
                                .addGroup(CustomerFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel10))
                                .addGap(18, 18, 18)
                                .addGroup(CustomerFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(date_tf_customer)
                                    .addComponent(phone_tf_customer)))))
                    .addGroup(CustomerFormLayout.createSequentialGroup()
                        .addGroup(CustomerFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CustomerFormLayout.createSequentialGroup()
                                .addGap(120, 120, 120)
                                .addComponent(jLabel9))
                            .addGroup(CustomerFormLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel12)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CustomerFormLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(sex_cb_customer, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        CustomerFormLayout.setVerticalGroup(
            CustomerFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CustomerFormLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(23, 23, 23)
                .addGroup(CustomerFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(nik_tf_customer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(CustomerFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name_tf_customer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(CustomerFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(place_tf_customer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(CustomerFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(date_tf_customer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(CustomerFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phone_tf_customer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(CustomerFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(sex_cb_customer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(CustomerFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(create_btn_customer, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(update_btn_customer, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete_btn_customer, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(163, Short.MAX_VALUE))
        );

        jLabel13.setText("Uname");

        jLabel14.setText("Pswd");

        jLabel15.setText("Name");

        create_btn_employee.setText("Create");
        create_btn_employee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                create_btn_employeeActionPerformed(evt);
            }
        });

        update_btn_employee.setText("Update");
        update_btn_employee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_btn_employeeActionPerformed(evt);
            }
        });

        delete_btn_employee.setText("Delete");
        delete_btn_employee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_btn_employeeActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Employee Form");

        jLabel17.setText("Email");

        jLabel19.setText("Role");

        role_cb_employee.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Employee" }));

        javax.swing.GroupLayout EmployeeFormLayout = new javax.swing.GroupLayout(EmployeeForm);
        EmployeeForm.setLayout(EmployeeFormLayout);
        EmployeeFormLayout.setHorizontalGroup(
            EmployeeFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EmployeeFormLayout.createSequentialGroup()
                .addGroup(EmployeeFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EmployeeFormLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel16)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(EmployeeFormLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(EmployeeFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(EmployeeFormLayout.createSequentialGroup()
                                .addComponent(create_btn_employee)
                                .addGap(46, 46, 46)
                                .addComponent(update_btn_employee)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                                .addComponent(delete_btn_employee))
                            .addGroup(EmployeeFormLayout.createSequentialGroup()
                                .addGroup(EmployeeFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel19))
                                .addGap(18, 18, 18)
                                .addGroup(EmployeeFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(role_cb_employee, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(email_tf_employee)
                                    .addComponent(uname_tf_employee)
                                    .addComponent(name_tf_employee, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(pswd_tf_employee, javax.swing.GroupLayout.Alignment.TRAILING))))))
                .addContainerGap())
        );
        EmployeeFormLayout.setVerticalGroup(
            EmployeeFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EmployeeFormLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addGap(23, 23, 23)
                .addGroup(EmployeeFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(uname_tf_employee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(EmployeeFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pswd_tf_employee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(EmployeeFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name_tf_employee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(18, 18, 18)
                .addGroup(EmployeeFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email_tf_employee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(18, 18, 18)
                .addGroup(EmployeeFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(role_cb_employee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(EmployeeFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(create_btn_employee, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(update_btn_employee, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete_btn_employee, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(217, Short.MAX_VALUE))
        );

        jLabel18.setText("Customer");

        jLabel20.setText("Car");

        jLabel21.setText("Start");

        finish_tf_rent.setEditable(false);

        total_tf_rent.setEditable(false);

        create_btn_rent.setText("Create");
        create_btn_rent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                create_btn_rentActionPerformed(evt);
            }
        });

        update_btn_rent.setText("Update");
        update_btn_rent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_btn_rentActionPerformed(evt);
            }
        });

        delete_btn_rent.setText("Delete");
        delete_btn_rent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_btn_rentActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setText("Rent Form");

        jLabel23.setText("Duration");

        jLabel24.setText("Finish");

        jLabel25.setText("Total");

        customer_cb_rent.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        calculate_btn_rent.setText("Calculate -->");
        calculate_btn_rent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculate_btn_rentActionPerformed(evt);
            }
        });

        car_cb_rent.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout RentFormLayout = new javax.swing.GroupLayout(RentForm);
        RentForm.setLayout(RentFormLayout);
        RentFormLayout.setHorizontalGroup(
            RentFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RentFormLayout.createSequentialGroup()
                .addGroup(RentFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RentFormLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(RentFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(RentFormLayout.createSequentialGroup()
                                .addComponent(create_btn_rent)
                                .addGap(46, 46, 46)
                                .addComponent(update_btn_rent)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(delete_btn_rent))
                            .addGroup(RentFormLayout.createSequentialGroup()
                                .addGroup(RentFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel21))
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addGroup(RentFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(start_tf_rent, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(car_cb_rent, javax.swing.GroupLayout.Alignment.TRAILING, 0, 240, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RentFormLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel18)
                                .addGap(18, 18, 18)
                                .addComponent(customer_cb_rent, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RentFormLayout.createSequentialGroup()
                                .addGroup(RentFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel24)
                                    .addComponent(jLabel25))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(RentFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(total_tf_rent, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                                    .addComponent(finish_tf_rent, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(duration_tf_rent, javax.swing.GroupLayout.Alignment.TRAILING)))))
                    .addGroup(RentFormLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel22)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(RentFormLayout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(calculate_btn_rent)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        RentFormLayout.setVerticalGroup(
            RentFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RentFormLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22)
                .addGap(23, 23, 23)
                .addGroup(RentFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(customer_cb_rent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(RentFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(car_cb_rent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(RentFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(start_tf_rent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addGap(18, 18, 18)
                .addGroup(RentFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(duration_tf_rent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(calculate_btn_rent, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(RentFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(finish_tf_rent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24))
                .addGap(26, 26, 26)
                .addGroup(RentFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(total_tf_rent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25))
                .addGap(18, 18, 18)
                .addGroup(RentFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(create_btn_rent, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(update_btn_rent, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete_btn_rent, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(114, 114, 114))
        );

        javax.swing.GroupLayout FormPanelLayout = new javax.swing.GroupLayout(FormPanel);
        FormPanel.setLayout(FormPanelLayout);
        FormPanelLayout.setHorizontalGroup(
            FormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FormPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(CarForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18))
            .addGroup(FormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FormPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(CustomerForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(FormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(FormPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(EmployeeForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(FormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(FormPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(RentForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        FormPanelLayout.setVerticalGroup(
            FormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FormPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CarForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(FormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(FormPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(CustomerForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(FormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(FormPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(EmployeeForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(FormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(FormPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(RentForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        TablePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        EmployeeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        EmployeeTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EmployeeTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(EmployeeTable);

        javax.swing.GroupLayout EmployeeTablePanelLayout = new javax.swing.GroupLayout(EmployeeTablePanel);
        EmployeeTablePanel.setLayout(EmployeeTablePanelLayout);
        EmployeeTablePanelLayout.setHorizontalGroup(
            EmployeeTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1008, Short.MAX_VALUE)
            .addGroup(EmployeeTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1008, Short.MAX_VALUE))
        );
        EmployeeTablePanelLayout.setVerticalGroup(
            EmployeeTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 506, Short.MAX_VALUE)
            .addGroup(EmployeeTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE))
        );

        CustomerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        CustomerTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CustomerTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(CustomerTable);

        javax.swing.GroupLayout CustomerTablePanelLayout = new javax.swing.GroupLayout(CustomerTablePanel);
        CustomerTablePanel.setLayout(CustomerTablePanelLayout);
        CustomerTablePanelLayout.setHorizontalGroup(
            CustomerTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1008, Short.MAX_VALUE)
            .addGroup(CustomerTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1008, Short.MAX_VALUE))
        );
        CustomerTablePanelLayout.setVerticalGroup(
            CustomerTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 506, Short.MAX_VALUE)
            .addGroup(CustomerTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE))
        );

        CarTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        CarTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CarTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(CarTable);

        javax.swing.GroupLayout CarTablePanelLayout = new javax.swing.GroupLayout(CarTablePanel);
        CarTablePanel.setLayout(CarTablePanelLayout);
        CarTablePanelLayout.setHorizontalGroup(
            CarTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1008, Short.MAX_VALUE)
            .addGroup(CarTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1008, Short.MAX_VALUE))
        );
        CarTablePanelLayout.setVerticalGroup(
            CarTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 506, Short.MAX_VALUE)
            .addGroup(CarTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE))
        );

        RentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        RentTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RentTableMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(RentTable);

        javax.swing.GroupLayout RentTablePanelLayout = new javax.swing.GroupLayout(RentTablePanel);
        RentTablePanel.setLayout(RentTablePanelLayout);
        RentTablePanelLayout.setHorizontalGroup(
            RentTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1008, Short.MAX_VALUE)
            .addGroup(RentTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 1008, Short.MAX_VALUE))
        );
        RentTablePanelLayout.setVerticalGroup(
            RentTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 506, Short.MAX_VALUE)
            .addGroup(RentTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout TablePanelLayout = new javax.swing.GroupLayout(TablePanel);
        TablePanel.setLayout(TablePanelLayout);
        TablePanelLayout.setHorizontalGroup(
            TablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1028, Short.MAX_VALUE)
            .addGroup(TablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(TablePanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(EmployeeTablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(TablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(TablePanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(CustomerTablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(TablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(TablePanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(CarTablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(TablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(TablePanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(RentTablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        TablePanelLayout.setVerticalGroup(
            TablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 526, Short.MAX_VALUE)
            .addGroup(TablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(TablePanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(EmployeeTablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(TablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(TablePanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(CustomerTablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(TablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(TablePanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(CarTablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(TablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(TablePanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(RentTablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MenuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(TitlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(FormPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(MenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TitlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FormPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void setVisibleCustomer(){
        this.PageTitle.setText("Customer");
        this.CustomerTablePanel.setVisible(true);
        this.CustomerForm.setVisible(true);
        this.CarForm.setVisible(false);
        this.CarTablePanel.setVisible(false);
        this.EmployeeTablePanel.setVisible(false);
        this.EmployeeForm.setVisible(false);
        this.RentForm.setVisible(false);
        this.RentTablePanel.setVisible(false);
        tableModel = new DefaultTableModel();
        tableModel.setColumnIdentifiers(new String[]{"ID", "NIK", "Name", "Place", "Date", "Phone", "Sex"});
        setCustomerTable();
    }
    
    private void setVisibleCar(){
        this.PageTitle.setText("Car");
        this.CustomerTablePanel.setVisible(false);
        this.CustomerForm.setVisible(false);
        this.CarForm.setVisible(true);
        this.CarTablePanel.setVisible(true);
        this.EmployeeTablePanel.setVisible(false);
        this.EmployeeForm.setVisible(false);
        this.RentForm.setVisible(false);
        this.RentTablePanel.setVisible(false);
        tableModel = new DefaultTableModel();
        tableModel.setColumnIdentifiers(new String[]{"ID", "NoPol", "Merk", "Price"});
        setCarTable();
    }
    
    private void setVisibleEmployee(){
        this.PageTitle.setText("Employee");
        this.CustomerTablePanel.setVisible(false);
        this.CustomerForm.setVisible(false);
        this.CarForm.setVisible(false);
        this.CarTablePanel.setVisible(false);
        this.EmployeeTablePanel.setVisible(true);
        this.EmployeeForm.setVisible(true);
        this.RentForm.setVisible(false);
        this.RentTablePanel.setVisible(false);
        tableModel = new DefaultTableModel();
        tableModel.setColumnIdentifiers(new String[]{"ID", "Uname", "Pswd", "Name", "Email", "Role"});
        setEmployeeTable();
    }
    
    private void setVisibleRent(){
        this.PageTitle.setText("Rent");
        this.CustomerTablePanel.setVisible(false);
        this.CustomerForm.setVisible(false);
        this.CarForm.setVisible(false);
        this.CarTablePanel.setVisible(false);
        this.EmployeeTablePanel.setVisible(false);
        this.EmployeeForm.setVisible(false);
        this.RentForm.setVisible(true);
        this.RentTablePanel.setVisible(true);
        tableModel = new DefaultTableModel();
        tableModel.setColumnIdentifiers(new String[]{"ID", "Customer", "Car", "Start", "Duration", "Finish", "Total"});
        setRentTable();
        setCBCustomer();
        setCBCar();
    }
    
    private void setCarTable(){
        if(carController.getAllCar()==null){
            JOptionPane.showMessageDialog(this,"Car List cannot be loaded");
        }else{
            for(Car c : carController.getAllCar()){
                Object[] o = new Object[4];
                o[0] = c.getId();
                o[1] = c.getNopol();
                o[2] = c.getMerk();
                o[3] = c.getPrice();
                tableModel.addRow(o);
            }
            this.CarTable.setModel(tableModel);
        }
    }
    
    private void setCustomerTable(){
        if(customerController.getAllCustomer()==null){
            JOptionPane.showMessageDialog(this,"Customer List cannot be loaded");
        }else{
            for(Customer c : customerController.getAllCustomer()){
                Object[] o = new Object[7];
                o[0] = c.getId();
                o[1] = c.getNik();
                o[2] = c.getName();
                o[3] = c.getPlace();
                o[4] = c.getDate();
                o[5] = c.getPhone();
                o[6] = c.getSex();
                tableModel.addRow(o);
            }
            this.CustomerTable.setModel(tableModel);
        }
    }
    
    private void setRentTable(){
        if(rentController.getAllRent()==null){
            JOptionPane.showMessageDialog(this,"Rent List cannot be loaded");
        }else{
            for(Rent r : rentController.getAllRent()){
                Object[] o = new Object[7];
                o[0] = r.getId();
                o[1] = r.getCustomer();
                o[2] = r.getCar();
                o[3] = r.getStart();
                o[4] = r.getDuration();
                o[5] = r.getFinish();
                o[6] = r.getTotal();
                tableModel.addRow(o);
            }
            this.RentTable.setModel(tableModel);
        }
    }
    
    private void setEmployeeTable(){
        if(employeeController.getAllEmployee()==null){
            JOptionPane.showMessageDialog(this,"Employee List cannot be loaded");
        }else{
            for(Employee e : employeeController.getAllEmployee()){
                Object[] o = new Object[6];
                o[0] = e.getId();
                o[1] = e.getUname();
                o[2] = e.getPswd();
                o[3] = e.getName();
                o[4] = e.getEmail();
                o[5] = e.getRole();
                tableModel.addRow(o);
            }
            this.EmployeeTable.setModel(tableModel);
        }
    }
    
    private void resetFormCar(){
        this.nopol_tf_car.setText("");
        this.merk_tf_car.setText("");
        this.price_tf_car.setText("");
    }
    
    private void resetFormCustomer(){
        this.nik_tf_customer.setText("");
        this.name_tf_customer.setText("");
        this.place_tf_customer.setText("");
        this.date_tf_customer.setText("");
        this.phone_tf_customer.setText("");
        this.sex_cb_customer.setSelectedIndex(0);
    }
    
    private void resetFormEmployee(){
        this.uname_tf_employee.setText("");
        this.pswd_tf_employee.setText("");
        this.name_tf_employee.setText("");
        this.email_tf_employee.setText("");
        this.role_cb_employee.setSelectedIndex(0);
    }
    
    private void resetFormRent(){
        this.customer_cb_rent.setSelectedIndex(0);
        this.car_cb_rent.setSelectedIndex(0);
        this.start_tf_rent.setText("");
        this.duration_tf_rent.setText("");
        this.finish_tf_rent.setText("");
        this.total_tf_rent.setText("");
    }
    
    private void setCBCustomer(){
        this.customer_cb_rent.removeAllItems();
        if(customerController.getAllCustomer()==null){
            JOptionPane.showMessageDialog(this, "Customer list cannot be shown");
        }else{
            for(Customer c : customerController.getAllCustomer()){
                this.customer_cb_rent.addItem(c.getId()+" - "+c.getName());
            }
        }
    }
    
    private void setCBCar(){
        this.car_cb_rent.removeAllItems();
        if(carController.getAllCar()==null){
            JOptionPane.showMessageDialog(this, "Car list cannot be shown");
        }else{
            for(Car c : carController.getAllCar()){
                this.car_cb_rent.addItem(c.getId()+" - "+c.getNopol()+"["+c.getMerk()+"] - "+c.getPrice());
            }
        }
    }
    
    private void car_btn_menuActionPerformed(java.awt.event.ActionEvent evt) {
        setVisibleCar();
    }

    private void customer_btn_menuActionPerformed(java.awt.event.ActionEvent evt) {
        setVisibleCustomer();
    }

    private void rent_btn_menuActionPerformed(java.awt.event.ActionEvent evt) {
        setVisibleRent();
    }

    private void employee_btn_menuActionPerformed(java.awt.event.ActionEvent evt) {
        setVisibleEmployee();
    }

    private void logout_btn_menuActionPerformed(java.awt.event.ActionEvent evt) {
        employeeController.logout(this);
    }

    private void create_btn_carActionPerformed(java.awt.event.ActionEvent evt) {
        String nopol = this.nopol_tf_car.getText();
        String merk = this.merk_tf_car.getText();
        int price = Integer.valueOf(this.price_tf_car.getText());
        
        Car car = new Car(nopol, merk, price);
        carController.setDML(car, CRUD.INSERT);
        resetFormCar();
        setVisibleCar();
    }

    private void update_btn_carActionPerformed(java.awt.event.ActionEvent evt) {
        String nopol = this.nopol_tf_car.getText();
        String merk = this.merk_tf_car.getText();
        int price = Integer.valueOf(this.price_tf_car.getText());
        
        Car car = new Car(this.carId, nopol, merk, price);
        carController.setDML(car, CRUD.UPDATE);
        resetFormCar();
        setVisibleCar();
    }

    private void delete_btn_carActionPerformed(java.awt.event.ActionEvent evt) {
        Car car = new Car(this.carId);
        carController.setDML(car, CRUD.DELETE);
        resetFormCar();
        setVisibleCar();
    }

    private void CarTableMouseClicked(java.awt.event.MouseEvent evt) {
        int row = this.CarTable.getSelectedRow();
        
        this.carId = (int) this.CarTable.getValueAt(row, 0);
        this.nopol_tf_car.setText((String) this.CarTable.getValueAt(row, 1));
        this.merk_tf_car.setText((String) this.CarTable.getValueAt(row, 2));
        this.price_tf_car.setText(String.valueOf(this.CarTable.getValueAt(row, 3)));
    }

    private void create_btn_customerActionPerformed(java.awt.event.ActionEvent evt) {
        String nik = this.nik_tf_customer.getText();
        String name = this.name_tf_customer.getText();
        String place = this.place_tf_customer.getText();
        String date = this.date_tf_customer.getText();
        String phone = this.phone_tf_customer.getText();
        String sex = (String) this.sex_cb_customer.getSelectedItem();
        
        Customer customer = new Customer(nik, name, place, date, phone, sex);
        customerController.setDML(customer, CRUD.INSERT);
        resetFormCustomer();
        setVisibleCustomer();
    }

    private void update_btn_customerActionPerformed(java.awt.event.ActionEvent evt) {
        String nik = this.nik_tf_customer.getText();
        String name = this.name_tf_customer.getText();
        String place = this.place_tf_customer.getText();
        String date = this.date_tf_customer.getText();
        String phone = this.phone_tf_customer.getText();
        String sex = (String) this.sex_cb_customer.getSelectedItem();
        
        Customer customer = new Customer(this.customerId, nik, name, place, date, phone, sex);
        customerController.setDML(customer, CRUD.UPDATE);
        resetFormCustomer();
        setVisibleCustomer();
    }

    private void delete_btn_customerActionPerformed(java.awt.event.ActionEvent evt) {
        Customer customer = new Customer(this.customerId);
        customerController.setDML(customer, CRUD.DELETE);
        resetFormCustomer();
        setVisibleCustomer();
    }

    private void CustomerTableMouseClicked(java.awt.event.MouseEvent evt) {
        int row = this.CustomerTable.getSelectedRow();
        
        this.customerId = (int) this.CustomerTable.getValueAt(row, 0);
        this.nik_tf_customer.setText((String) this.CustomerTable.getValueAt(row, 1));
        this.name_tf_customer.setText((String) this.CustomerTable.getValueAt(row, 2));
        this.place_tf_customer.setText((String) this.CustomerTable.getValueAt(row, 3));
        this.date_tf_customer.setText((String) this.CustomerTable.getValueAt(row, 4));
        this.phone_tf_customer.setText((String) this.CustomerTable.getValueAt(row, 5));
        for(int i=0; i<this.sex_cb_customer.getItemCount(); i++){
            if((this.sex_cb_customer.getItemAt(i)).equals((String)this.CustomerTable.getValueAt(row, 6))) this.sex_cb_customer.setSelectedIndex(i);
        }
    }

    private void create_btn_employeeActionPerformed(java.awt.event.ActionEvent evt) {
        String uname = this.uname_tf_employee.getText();
        String pswd = this.pswd_tf_employee.getText();
        String name = this.name_tf_employee.getText();
        String email = this.email_tf_employee.getText();
        int role = this.role_cb_employee.getSelectedIndex();
        
        Employee employee = new Employee(uname, pswd, name, email, role);
        employeeController.setDML(employee, CRUD.INSERT);
        resetFormEmployee();
        setVisibleEmployee();
    }

    private void update_btn_employeeActionPerformed(java.awt.event.ActionEvent evt) {
        String uname = this.uname_tf_employee.getText();
        String pswd = this.pswd_tf_employee.getText();
        String name = this.name_tf_employee.getText();
        String email = this.email_tf_employee.getText();
        int role = this.role_cb_employee.getSelectedIndex();
        
        Employee employee = new Employee(this.employeeId, uname, pswd, name, email, role);
        employeeController.setDML(employee, CRUD.UPDATE);
        resetFormEmployee();
        setVisibleEmployee();
    }

    private void delete_btn_employeeActionPerformed(java.awt.event.ActionEvent evt) {
        Employee employee = new Employee(this.employeeId);
        employeeController.setDML(employee, CRUD.DELETE);
        resetFormEmployee();
        setVisibleEmployee();
    }

    private void EmployeeTableMouseClicked(java.awt.event.MouseEvent evt) {
        int row = this.EmployeeTable.getSelectedRow();
        this.employeeId = (int) this.EmployeeTable.getValueAt(row, 0);
        this.uname_tf_employee.setText((String) this.EmployeeTable.getValueAt(row, 1));
        this.pswd_tf_employee.setText((String) this.EmployeeTable.getValueAt(row, 2));
        this.name_tf_employee.setText((String) this.EmployeeTable.getValueAt(row, 3));
        this.email_tf_employee.setText((String) this.EmployeeTable.getValueAt(row, 4));
        this.role_cb_employee.setSelectedIndex((int) this.EmployeeTable.getValueAt(row, 5));
    }

    private void create_btn_rentActionPerformed(java.awt.event.ActionEvent evt) {
        String car = (String) this.car_cb_rent.getSelectedItem();
        String[] splitted_car = car.split(" - ", 3);
        int car_id = Integer.valueOf(splitted_car[0]);
        
        String customer = (String) this.customer_cb_rent.getSelectedItem();
        String[] splitted_customer = customer.split(" - ", 2);
        int customer_id = Integer.valueOf(splitted_customer[0]);
        
        String start = this.start_tf_rent.getText();
        int duration = Integer.valueOf(this.duration_tf_rent.getText());
        String finish = this.finish_tf_rent.getText();
        int total = Integer.valueOf(this.total_tf_rent.getText());
        
        Rent rent = new Rent(customer_id, car_id, start, duration, finish, total);
        rentController.setDML(rent, CRUD.INSERT);
        resetFormRent();
        setVisibleRent();
    }

    private void update_btn_rentActionPerformed(java.awt.event.ActionEvent evt) {
        String car = (String) this.car_cb_rent.getSelectedItem();
        String[] splitted_car = car.split(" - ", 3);
        int car_id = Integer.valueOf(splitted_car[0]);
        
        String customer = (String) this.customer_cb_rent.getSelectedItem();
        String[] splitted_customer = customer.split(" - ", 2);
        int customer_id = Integer.valueOf(splitted_customer[0]);
        
        String start = this.start_tf_rent.getText();
        int duration = Integer.valueOf(this.duration_tf_rent.getText());
        String finish = this.finish_tf_rent.getText();
        int total = Integer.valueOf(this.total_tf_rent.getText());
        
        Rent rent = new Rent(this.rentId, customer_id, car_id, start, duration, finish, total);
        rentController.setDML(rent, CRUD.UPDATE);
        resetFormRent();
        setVisibleRent();
    }

    private void delete_btn_rentActionPerformed(java.awt.event.ActionEvent evt) {
        Rent rent = new Rent(this.rentId);
        rentController.setDML(rent, CRUD.DELETE);
        resetFormRent();
        setVisibleRent();
    }

    private void RentTableMouseClicked(java.awt.event.MouseEvent evt) {
        int row = this.RentTable.getSelectedRow();
        
        this.rentId = (int) this.RentTable.getValueAt(row, 0);
        this.start_tf_rent.setText((String) this.RentTable.getValueAt(row, 3));
        this.duration_tf_rent.setText(String.valueOf(this.RentTable.getValueAt(row, 4)));
        this.finish_tf_rent.setText((String) this.RentTable.getValueAt(row, 5));
        this.total_tf_rent.setText(String.valueOf(this.RentTable.getValueAt(row, 6)));
        
        for(int i=0; i<this.customer_cb_rent.getItemCount(); i++){
            String customer = (String) this.customer_cb_rent.getItemAt(i);
            String[] splitted_customer = customer.split(" - ", 2);
            int customer_id = Integer.valueOf(splitted_customer[0]);
            if(customer_id == ((int) this.RentTable.getValueAt(row, 1))) this.customer_cb_rent.setSelectedIndex(i);
        }
        
        for(int i=0; i<this.customer_cb_rent.getItemCount(); i++){
            String car = (String) this.car_cb_rent.getItemAt(i);
            String[] splitted_car = car.split(" - ", 3);
            int car_id = Integer.valueOf(splitted_car[0]);
            if(car_id == ((int) this.RentTable.getValueAt(row, 2))) this.customer_cb_rent.setSelectedIndex(i);
        }
    }

    private void calculate_btn_rentActionPerformed(java.awt.event.ActionEvent evt) {
        String car = (String) this.car_cb_rent.getSelectedItem();
        String[] splitted_car = car.split(" - ", 3);
        int car_price = Integer.valueOf(splitted_car[2]);
        String start = this.start_tf_rent.getText();
        int duration = Integer.valueOf(this.duration_tf_rent.getText());
        int total  = duration * car_price;
        
        Date startDate = null;
        try {
            startDate = new SimpleDateFormat("yyyy-MM-dd").parse(start);
        } catch (ParseException ex) {
            Logger.getLogger(HalamanAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Calendar c = Calendar.getInstance();
        c.setTime(startDate);
        c.add(Calendar.DATE, duration);
        Date finishDate = c.getTime();
        String finish = String.valueOf(dateFormat.format(finishDate));
        
        this.finish_tf_rent.setText(finish);
        this.total_tf_rent.setText(String.valueOf(total));
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HalamanAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HalamanAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HalamanAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HalamanAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HalamanAdmin().setVisible(true);
            }
        });
    }

    private javax.swing.JPanel CarForm;
    private javax.swing.JTable CarTable;
    private javax.swing.JPanel CarTablePanel;
    private javax.swing.JPanel CustomerForm;
    private javax.swing.JTable CustomerTable;
    private javax.swing.JPanel CustomerTablePanel;
    private javax.swing.JPanel EmployeeForm;
    private javax.swing.JTable EmployeeTable;
    private javax.swing.JPanel EmployeeTablePanel;
    private javax.swing.JPanel FormPanel;
    private javax.swing.JPanel MenuPanel;
    private javax.swing.JLabel PageTitle;
    private javax.swing.JPanel RentForm;
    private javax.swing.JTable RentTable;
    private javax.swing.JPanel RentTablePanel;
    private javax.swing.JPanel TablePanel;
    private javax.swing.JPanel TitlePanel;
    private javax.swing.JButton calculate_btn_rent;
    private javax.swing.JButton car_btn_menu;
    private javax.swing.JComboBox<String> car_cb_rent;
    private javax.swing.JButton create_btn_car;
    private javax.swing.JButton create_btn_customer;
    private javax.swing.JButton create_btn_employee;
    private javax.swing.JButton create_btn_rent;
    private javax.swing.JButton customer_btn_menu;
    private javax.swing.JComboBox<String> customer_cb_rent;
    private javax.swing.JTextField date_tf_customer;
    private javax.swing.JButton delete_btn_car;
    private javax.swing.JButton delete_btn_customer;
    private javax.swing.JButton delete_btn_employee;
    private javax.swing.JButton delete_btn_rent;
    private javax.swing.JTextField duration_tf_rent;
    private javax.swing.JTextField email_tf_employee;
    private javax.swing.JButton employee_btn_menu;
    private javax.swing.JTextField finish_tf_rent;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton logout_btn_menu;
    private javax.swing.JTextField merk_tf_car;
    private javax.swing.JTextField name_tf_customer;
    private javax.swing.JTextField name_tf_employee;
    private javax.swing.JTextField nik_tf_customer;
    private javax.swing.JTextField nopol_tf_car;
    private javax.swing.JTextField phone_tf_customer;
    private javax.swing.JTextField place_tf_customer;
    private javax.swing.JTextField price_tf_car;
    private javax.swing.JTextField pswd_tf_employee;
    private javax.swing.JButton rent_btn_menu;
    private javax.swing.JComboBox<String> role_cb_employee;
    private javax.swing.JComboBox<String> sex_cb_customer;
    private javax.swing.JTextField start_tf_rent;
    private javax.swing.JTextField total_tf_rent;
    private javax.swing.JTextField uname_tf_employee;
    private javax.swing.JButton update_btn_car;
    private javax.swing.JButton update_btn_customer;
    private javax.swing.JButton update_btn_employee;
    private javax.swing.JButton update_btn_rent;
}
