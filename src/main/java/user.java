package main.java;

import java.util.List;

public class User {
    String role, username, password, sex, name, age;
    
    public boolean authenticate(String username, String password){
        List<String> authenticationData = DAO.readAll("build/classes/main/resource/userDetails.txt");
        for(String line: authenticationData){
            String[] credentials = line.split(";");
            if (credentials[0].equals(username) && credentials[1].equals(password)){
                this.role=credentials[2];
                this.age=credentials[4];
                this.sex=credentials[5];
                this.username=credentials[0];
                this.name=credentials[3];
                this.password=credentials[1];
                return true;
            }
        }
        return false;
    }

//    public void removeProduct() {
//        List<String> allProduct = DAO.readAll("build/classes/main/resource/Product.txt");
//        
//    }
    
    public void setRole(String role) {
        this.role = role;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getSex() {
        return sex;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }
      
    public String getRole(){
        return this.role;
    }
}
