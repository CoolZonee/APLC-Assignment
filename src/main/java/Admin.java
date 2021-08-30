package main.java;

import java.util.List;

public class Admin extends User{
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
    public User[] loadUser() {
        List<String> allUser = DAO.readAll(resource);
        User[] users = new User[allUser.size()];
        for (int i = 0; i < allUser.size(); i++) {              
            String[] details = allUser.get(i).split(";");
            users[i] = new User(
                    details[2],
                    details[0],
                    details[1],
                    details[5],
                    details[3],
                    details[4]
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
    /************ Customer CRUD End ***************/
    
    /************ Product CRUD ***************/
    public Product[] loadProduct() {
        return Product.loadProduct();
    }

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
    
}
