package main.java;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> products;
    private List<Product> orderedProducts;
    private String quantityInvalidMessage;
    private boolean isQuantityValid;
    
    public Cart() {
        this.products = new ArrayList<>();
        this.orderedProducts = new ArrayList<>();
        this.isQuantityValid = true;
    }
     
    public List<OrderItem> checkProductQuantity(String orderUUID){
        List<OrderItem> orderItem = new ArrayList<>();
        List<Product> productArr = Product.loadProduct();
        for (Product cartItem: this.getProducts()){
             String cartName = cartItem.getName();
             int cartQuantity = cartItem.getQuantity();
             for(Product product: productArr){
                if(cartName.equals(product.getName())) {
                    if(cartQuantity > product.getQuantity()) {
                        this.quantityInvalidMessage = (this.quantityInvalidMessage +
                                        "The available quantity for: " + 
                                        product.getName() + 
                                        " is: " + product.getQuantity()
                                        + "\n");
                        this.isQuantityValid = false;
                    }
                    else{
                        this.orderedProducts.add(product);
                        OrderItem item = new OrderItem(
                                orderUUID,
                                product.getCode(), 
                                product.getName(), 
                                cartQuantity, 
                                product.getPrice()
                        );
                        orderItem.add(item);
                    }
                }
                
            }
        }
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
        return this.products.isEmpty();
    }
    
    public void resetQuantityCheck(){
        this.quantityInvalidMessage = "";
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

    public String getQuantityInvalidMessage() {
        return this.quantityInvalidMessage;
    }
    
    public boolean getIsQuantityValid () {
        return this.isQuantityValid;
    }
    
    public String toString() {
        return "cart" + this.products.toString();
    }
    
    public List<Product> getOrderedProducts() {
        return this.orderedProducts;
    }
    
}
