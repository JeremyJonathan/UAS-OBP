package Model;

public class Customer {
    private int id;
    private String nik;
    private String name;
    private String place;
    private String date;
    private String phone;
    private String sex;
    
    public Customer(int id, String nik, String name, String place, String date, String phone, String sex){
        this.id = id;
        this.nik = nik;
        this.name = name;
        this.place = place;
        this.date = date;
        this.phone = phone;
        this.sex = sex;
    }
    
    public Customer(String nik, String name, String place, String date, String phone, String sex){
        this.nik = nik;
        this.name = name;
        this.place = place;
        this.date = date;
        this.phone = phone;
        this.sex = sex;
    }
    
    public Customer(int id){
        this.id = id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public int getId(){
        return this.id;
    }
    
    public void setNik(String nik){
        this.nik = nik;
    }
    
    public String getNik(){
        return this.nik;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setPlace(String place){
        this.place = place;
    }
    
    public String getPlace(){
        return this.place;
    }
    
    public void setDate(String date){
        this.date = date;
    }
    
    public String getDate(){
        return this.date;
    }
    
    public void setPhone(String phone){
        this.phone = phone;
    }
    
    public String getPhone(){
        return this.phone;
    }
    
    public void setSex(String sex){
        this.sex = sex;
    }
    
    public String getSex(){
        return this.sex;
    }    
}
