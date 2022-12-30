package main.java;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Cart {
    private List<Product> cart;
    private List<Product> orderedProducts;
    private String quantityInvalidMessage;
    private boolean isQuantityValid;
    
    public Cart() {
        this.cart = new ArrayList<>();
        this.orderedProducts = new ArrayList<>();
        this.isQuantityValid = true;
    }
     
    public List<OrderItem> checkProductQuantity(String orderUUID){
        List<OrderItem> orderItem = new ArrayList<>();
        List<Product> productArr = Product.loadProduct();
        
        this.getCartItem().forEach(cartItem -> {
            productArr
                .stream()
                .filter(product 
                        -> product
                                .getCode()
                                .equals(cartItem.getCode()))
                .forEach(e -> {
                    if (cartItem.getQuantity() > e.getQuantity()) {
                        this.quantityInvalidMessage = this.quantityInvalidMessage +
                                 "The available quantity for: " + 
                                 e.getName() + 
                                 " is: " + e.getQuantity()
                                 + "\n";
                        this.isQuantityValid = false;
                    }
                    else {
                        this.orderedProducts.add(e);
                        OrderItem item = new OrderItem(
                                orderUUID,
                                e.getCode(), 
                                e.getName(), 
                                cartItem.getQuantity(), 
                                e.getPrice()
                        );
                        orderItem.add(item);
                    }
            });
        });
        return orderItem;

    }
    public void clearFinalCart(){
        if (!orderedProducts.isEmpty()){
            this.orderedProducts.clear();  
        }
    }
    public void setIsQuantityValid(boolean option) {
        this.isQuantityValid = option;
    }
    
    public boolean isEmpty(){
        return this.cart.isEmpty();
    }
    
    public void resetQuantityCheck(){
        this.quantityInvalidMessage = "";
    }
    
    public void addProduct(Product product) {
        this.cart.add(product);
    }

    public void clearCart() {
        this.cart.clear();
    }
    
    public double calculateTotalPrice() {
        return Utils.doubleCalculateTotal(this.cart.stream()
                .map(item -> (item.getQuantity() * item.getPrice()))
                .collect(Collectors.toList()));
    }
    
    public List<Product> getCartItem() {
        return this.cart;
    }

    public String getQuantityInvalidMessage() {
        return this.quantityInvalidMessage;
    }
    
    public boolean getIsQuantityValid () {
        return this.isQuantityValid;
    }
    
    public String toString() {
        return "cart" + this.cart.toString();
    }
    
    public List<Product> getOrderedProducts() {
        return this.orderedProducts;
    }
    
}
