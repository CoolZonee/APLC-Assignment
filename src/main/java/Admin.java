package main.java;

import java.util.ArrayList;
import java.util.List;

public class Admin extends User implements CheckRecord{
    public Admin() {}
    public Admin(
            String role, 
            String username, 
            String password, 
            String sex, 
            String name, 
            String age
    ) {
        super(role, username, password, sex, name, age);
    }
    
     /************ User CRUD ***************/
    public List<User> loadUser() {
        List<String> allUser = DAO.readAll(resource);
        List<User> users = new ArrayList<>();
        for (String line: allUser) {              
            String[] details = line.split(";");
            users.add(new User(
                    details[2],
                    details[0],
                    details[1],
                    details[5],
                    details[3],
                    details[4]
                )
            );
        }
        return users;
    }
    
    public void addUser(User user) {
        DAO.append(user.toString(), resource);
    }
    
    public void updateUser(User user) {
        List<String> allUser = DAO.readAll(resource);
        for(int i = 0; i < allUser.size(); i++) {
            String[] userDetails = allUser.get(i).split(";");
            if (userDetails[0].equals(user.getUsername())) {
                allUser.set(i, user.toString());
                break;
            }
        }
        DAO.rewrite(allUser, resource);
    }
    
    @Override
    public boolean checkIfRecordExist(String username) {
        List<User> userList = loadUser();
        boolean valid = true;
        for (User u: userList) {
            if (u.getUsername().equals(username)) {
                valid = false;
            }
        }
        return valid;
    }
    
    public boolean checkProduct(Product product) {
        return product.checkIfRecordExist(product.getCode());
    }
    
    public void removeUser(User user) {
        List<String> allUser = DAO.readAll(resource);
        for(int i = 0; i < allUser.size(); i++) {
            String[] userDetails = allUser.get(i).split(";");
            if (userDetails[0].equals(user.getUsername())) {
                allUser.remove(i);
                break;
            }
        }
        DAO.rewrite(allUser, resource);
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
