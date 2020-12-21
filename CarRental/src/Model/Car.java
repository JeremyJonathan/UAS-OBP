package Model;

public class Car {
    private int id;
    private String nopol;
    private String merk;
    private int price;
    
    public Car(int id, String nopol, String merk, int price){
        this.id = id;
        this.nopol = nopol;
        this.merk = merk;
        this.price = price;
    }
    
    public Car(String nopol, String merk, int price){
        this.nopol = nopol;
        this.merk = merk;
        this.price = price;
    }
    
    public Car(int id){
        this.id = id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public int getId(){
        return this.id;
    }
    
    public void setNopol(String nopol){
        this.nopol = nopol;
    }
    
    public String getNopol(){
        return this.nopol;
    }
    
    public void setMerk(String merk){
        this.merk = merk;
    }
    
    public String getMerk(){
        return this.merk;
    }
    
    public void setPrice(int price){
        this.price = price;
    }
    
    public int getPrice(){
        return this.price;
    }
}
