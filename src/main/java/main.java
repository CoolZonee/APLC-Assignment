
package main.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


        
public class main {
    public static void main(String[] args) {
        user user1 = new user("JoshuaLotion","1234abcd");
        File userDetails = new File("C:\\Users\\jamie\\Documents\\NetBeansProjects\\assignment\\oodj-assignment\\userDetails.txt"); //getproperpathcode
        String role = "N";
        Scanner scan;
        try {
            scan = new Scanner(userDetails);
            scan.useDelimiter(";");  
        while(scan.hasNextLine()){
            String fileUsername=scan.next();
            String filePassword=scan.next();
            if ((fileUsername.equals(user1.getUsername()))&&(filePassword.equals(user1.getPassword()))){
                role=scan.next();
                System.out.println("authenticated successful");
                break;
            }
            
            scan.nextLine();
        } 
        } catch (FileNotFoundException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       
      
    }
}
