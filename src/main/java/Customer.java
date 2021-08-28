/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java;

import java.util.List;

public class Customer extends User{
    
    public Customer() {}
    
    public Customer(
            String role, 
            String username, 
            String password, 
            String sex,
            String name, 
            String age
    ) {
        super(role, username, password, sex, name, age);
    }
}
