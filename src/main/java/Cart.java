/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jieke
 */
public class Cart {
    List<Product> products = new ArrayList<Product>();
    
    public Cart() {
    }
    
    public void addProduct(Product product) {
        this.products.add(product);
    }

    public void clearCart() {
        this.products.clear();
    }
    
    public double calculateTotalPrice() {
        double totalPrice = 0.0;
        for(Product product: this.products) {
            totalPrice += product.getPrice() * product.getQuantity();
        }
        return totalPrice;
    }
    
    public List<Product> getProducts() {
        return this.products;
    }
    
    public String toString() {
        return "cart" + this.products.toString();
    }
}
