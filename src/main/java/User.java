package main.java;

import java.util.List;
import java.awt.print.PrinterJob;

public class User implements Authentication {
    private String role, username, password, sex, name;
    private int age;
    private boolean isNew = true;  
    private String loginData;
    public static String resourcePath = "src/main/resource/userDetails.txt";
    public static String resourceLogPath = "src/main/resource/userLog.txt";

    public User() {}
    
    public User(String role, String username, String password, String sex, String name, int age) {
        this.role = role;
        this.username = username;
        this.password = password;
        this.sex = sex;
        this.name = name;
        this.age = age;
    }
    
    @Override
    public boolean authenticate(String username, String password){
        List<String> authenticationData = DAO.readAll(resourcePath);

        return authenticationData.stream()
                .anyMatch(line -> {
            String[] credentials = line.split(";"); // split the line into user details
            if (credentials[0].equals(username) && credentials[1].equals(password)){ // check if the username and password correct
                // set the user if credentials valid
                this.role=credentials[2];
                this.age=Integer.parseInt(credentials[4]);
                this.sex=credentials[5];
                this.username=credentials[0];
                this.name=credentials[3];
                this.password=credentials[1];
                return true;
            }
            return false;
        });
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
        DAO.append(loginDataFinal, resourceLogPath);
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
    
    public Order getMostSpentOrder(List<Order> orders) {
        return Order.mostSpentOrder.apply(orders.get(0), orders);
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

    public void setAge(int age) {
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

    public int getAge() {
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