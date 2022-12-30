package main.java;

import java.util.List;
import java.util.stream.Collectors;

public class Admin extends User implements CheckRecord{
    public Admin() {}
    public Admin(
            String role, 
            String username, 
            String password, 
            String sex, 
            String name, 
            int age
    ) {
        super(role, username, password, sex, name, age);
    }
    
     /************ User CRUD ***************/
    public List<User> loadUser() {
        List<String> allUser = DAO.readAll(resourcePath);
        
        // return List<User>
        return allUser.stream()
                .map(line ->  // iterate every line of the txt file
                    line.split(";") // split the line into the user details array
                )
                .map(user -> // create user
                    new User(
                            user[2],
                            user[0],
                            user[1],
                            user[5],
                            user[3],
                            Integer.parseInt(user[4])
                        )
                )
                .collect(Collectors.toList()); // convert the Stream to List
    }
    
    public void addUser(User user) {
        DAO.append(user.toString(), resourcePath);
    }
    
    public void updateUser(User user) {
        List<String> allUser = DAO.readAll(resourcePath);
        
        var updated = allUser.stream() // change the targeted user details
                .map(u -> 
                    List.of(u.split(";")).stream() // split the line into user details
                    .findFirst() // get the line[0], which is username
                    .get()
                    .equals(user.getUsername()) ? user.toString() : u // if the username matched, change the details to the latest one
                )
                .collect(Collectors.toList()); // convert the Stream to List
 
        DAO.rewrite(updated, resourcePath); // write the updated List into text file
    }
    
    @Override
    public boolean checkIfRecordExist (String username){
            return !loadUser().stream()
                .anyMatch(user -> // if any result matched, return true
                        user.getUsername().equals(username)); // check if the username existed
    }
    
    
    public boolean checkProduct(Product product) {
        return product.checkIfRecordExist(product.getCode());
    }
    
    public void removeUser(User user) {
        List<String> allUser = DAO.readAll(resourcePath);
        
        var removed = allUser.stream()
                .filter(u -> //filter the matched username
                     !List.of(u.split(";"))
                    .stream()
                    .findFirst() // get line[0], which is username
                    .get()
                    .equals(user.getUsername()) // check if matched, if matched, remove the user details of the List
                )
                .collect(Collectors.toList());
            
        DAO.rewrite(removed, resourcePath);
    }
    
    /************ User CRUD End ***************/
    
    /************ Product CRUD ***************/
    public void addProduct(Product product) {
        product.addProduct();
    }

    public void updateProduct(Product product) {
        product.updateProduct();
    }

    public void removeProduct(Product product) {
        product.removeProduct();
    }    

    
    /************ Product CRUD End ***************/
    
    public void generateReport(String date, List<Order> orders) {
        Report.GenerateReport(date, orders);
    }
}
