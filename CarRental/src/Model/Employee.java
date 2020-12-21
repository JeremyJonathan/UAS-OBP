package Model;

public class Employee {
    private int id;
    private String uname;
    private String pswd;
    private String name;
    private String email;
    private int role;
    
    public Employee(int id, String uname, String pswd, String name, String email, int role){
        this.id = id;
        this.uname = uname;
        this.pswd = pswd;
        this.name = name;
        this.email = email;
        this.role = role;
    }
    
    public Employee(String uname, String pswd, String name, String email, int role){
        this.uname = uname;
        this.pswd = pswd;
        this.name = name;
        this.email = email;
        this.role = role;
    }
    
    public Employee(String uname, String pswd){
        this.uname = uname;
        this.pswd = pswd;
    }
    
    public Employee(int id){
        this.id = id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public int getId(){
        return this.id;
    }
    
    public void setUname(String uname){
        this.uname = uname;
    }
    
    public String getUname(){
        return this.uname;
    }
    
    public void setPswd(String pswd){
        this.pswd = pswd;
    }
    
    public String getPswd(){
        return this.pswd;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public String getEmail(){
        return this.email;
    }
    
    public void setRole(int role){
        this.role = role;
    }
    
    public int getRole(){
        return this.role;
    }
        
        
        
}
