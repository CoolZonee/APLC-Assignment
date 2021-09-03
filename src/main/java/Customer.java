package main.java;

public class Customer extends User{
    
    public Customer() {}
    
    public Customer(
            String role, 
            String username, 
            String password, 
            String sex,
            String name, 
            int age
    ) {
        super(role, username, password, sex, name, age);
    }
}
