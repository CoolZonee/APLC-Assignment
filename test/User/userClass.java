package User;

public class userClass implements authentication{
    private String username, password;
    
    public userClass(String username, String password){
        this.username=username;
        this.password=password;
           
    }
    @Override
    public boolean login(){
        if (this.username.equals("admin") && this.password.equals("admin")){
            return true;
        }
        else{
            return false;
        }     
        
    }
    
}
