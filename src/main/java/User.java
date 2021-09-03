package main.java;

import java.util.List;
import java.awt.print.PrinterJob;

public class User implements Authentication {
    private String role, username, password, sex, name, age;
    private boolean isNew = true;  
    private String loginData;
    public static String resource = "src/main/resource/userDetails.txt";
    public static String resourceLog = "src/main/resource/userLog.txt";

    public User() {}
    
    public User(String role, String username, String password, String sex, String name, String age) {
        this.role = role;
        this.username = username;
        this.password = password;
        this.sex = sex;
        this.name = name;
        this.age = age;
    }
    
    @Override
    public boolean authenticate(String username, String password){
        List<String> authenticationData = DAO.readAll(resource);
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
    
    public void logLoginTime(){
        this.loginData=(this.username + ";" + 
                    this.name + ";" + 
                    getFullRole() + ";" + 
                    DateAndTime.getCurrentTime());
    }
    
    public void saveLogoutTime(){
        String loginDataFinal= (this.loginData +";" + 
                    DateAndTime.getCurrentTime()+ ";" +
                    DateAndTime.getCurrentDate() + ";");
        DAO.append(loginDataFinal, resourceLog);
    }
    
    public List<Product> loadProduct() {
        return Product.loadProduct();
    }
    
    public void addOrder(Order order) {
        order.addOrder();
    }
    
    public List <Order> loadOrder() {
        return Order.loadOrder();
    }
    
    public List <Order> loadUserOrder() {
        return Order.loadUserOrder(getUsername());
    }
    
    public void removeOrder(Order order) {
        order.removeOrder();
    }
    
    public static void printReceipt(Order order) {
        PrinterJob pj = PrinterJob.getPrinterJob();
        ReceiptPrintable print = new ReceiptPrintable(order);
        pj.setPrintable(print, print.getPageFormat(pj, order.getOrderItems().size()));
        
        try{
            pj.print();
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
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

    public void setIsNew(boolean isNew) {
        this.isNew = isNew;
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
    
    public boolean getIsNew() {
        return this.isNew;
    }
    public String getFullRole(){
        if (this.role.equals("A")){
            return "Admin";
        }else{
            return "Customer";
        }
    }
    
    @Override
    public String toString() {
        return this.username + ";" +
                this.password + ";" +
                this.role + ";" +
                this.name + ";" +
                this.age + ";" +
                this.sex;
    }
}