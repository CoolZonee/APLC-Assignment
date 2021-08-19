package main.java;
//import main.resource.User;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import main.java.*;


public class authentication {

    //private String username;
    String role = "N";
    Scanner scan;
    public boolean login(String username, String password){
        
        File userDetails = new File("C:\\Users\\jamie\\Documents\\NetBeansProjects\\assignment\\oodj-assignment\\userDetails.txt"); //getproperpathcode
        try {
            scan = new Scanner(userDetails);
            scan.useDelimiter(";");  
        while(scan.hasNextLine()){
            String fileUsername=scan.next();
            String filePassword=scan.next();
            if ((fileUsername.equals(username))&&(filePassword.equals(password))){
                role=scan.next();
                if(role=="A"){
                    user admin=new user();
                    admin.setUsername(username);
                    admin.setPassword(password);
                    admin.setRole(role);
                }else{
                    user customer=new user();
                    customer.setUsername(username);
                    customer.setPassword(password);
                    customer.setRole(role);
                }
                System.out.println("authenticated successful");
                return true;
                
            }
            scan.nextLine();
        } 
        
        } catch (FileNotFoundException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        return false;
    }
    
}
