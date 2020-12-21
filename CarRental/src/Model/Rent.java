package Model;

public class Rent {
    private int id;
    private int customer;
    private int car;
    private String start;
    private int duration;
    private String finish;
    private int total;
    
    public Rent(int id, int customer, int car, String start, int duration, String finish, int total){
        this.id = id;
        this.customer = customer;
        this.car = car;
        this.start = start;
        this.duration = duration;
        this.finish = finish;
        this.total = total;
    }
    
    public Rent(int customer, int car, String start, int duration, String finish, int total){
        this.customer = customer;
        this.car = car;
        this.start = start;
        this.duration = duration;
        this.finish = finish;
        this.total = total;
    }
    
    public Rent(int id){
        this.id = id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public int getId(){
        return this.id;
    }
    
    public void setCustomer(int customer){
        this.customer = customer;
    }
    
    public int getCustomer(){
        return this.customer;
    }
    
    public void setCar(int car){
        this.car = car;
    }
    
    public int getCar(){
        return this.car;
    }
    
    public void setStart(String start){
        this.start = start;
    }
    
    public String getStart(){
        return this.start;
    }
    
    public void setDuration(int duration){
        this.duration = duration;
    }
    
    public int getDuration(){
        return this.duration;
    }
    
    public void setFinish(String finish){
        this.finish = finish;
    }
    
    public String getFinish(){
        return this.finish;
    }
    
    public void setTotal(int total){
        this.total = total;
    }
    
    public int getTotal(){
        return this.total;
    }
    
    
}
