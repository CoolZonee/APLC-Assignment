package main.java;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jieke
 */
public class Cart {
    List<Product> products = new ArrayList<Product>();
    private String quantityInvalidMessage;
    public Cart() {
    }
    public boolean isEmpty(){
        return this.products.isEmpty();
    }
    
    
    public boolean checkProductQuantity(Product productCheck,String productName,int productQuantity, int row){
        //for (int i=0;i < tableModel.getRowCount();i++){
//        for(Product productCheck: product){
//            if( productName.equals(productCheck.getName())){
//                if (productQuantity>productCheck.getQuantity()){
//        this.quantityInvalidMessage = (this.quantityInvalidMessage +
//                                        "The available quantity for: " + 
//                                        productCheck.getName() + 
//                                        " is: " + productCheck.getQuantity()
//                                        + "\n");
//        return false;
                //}else{
                    //OrderItem orderItem = new OrderItem(productCheck.getCode(),productCheck.getName(),productQuantity, (productCheck.getPrice() * productQuantity));
                    //return true;                   
//                }
//
//            }
       // }
        
        return true;
    }
    public void resetQuantityCheck(){
        this.quantityInvalidMessage="";
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

    public String getQuantityInvalidMessage() {
        return quantityInvalidMessage;
    }
    
}
