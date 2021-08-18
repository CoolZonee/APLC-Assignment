package main.java;
//import User.authentication;

public class user{
    private String username, password,role,name,gender;
    private int age;
    
    //authentication authenticate=new authentication();
    
    public user(String username, String password){
        this.username=username;
        this.password=password;
        //this.role= authenticate.authenticate(this.username,this.password);
        
    }
    public String getUsername(){
        return this.username;
    }
    public String getPassword(){
        return this.password
                
                ;
    }
   
    
    public boolean login(String username, String password){
        if (this.username.equals(username) && this.password.equals(password)){
            return true;
        }
        else{
            return false;
        }     
        
    }

}
