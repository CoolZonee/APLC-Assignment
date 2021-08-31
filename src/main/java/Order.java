package main.java;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Order {
    double paid = 0, change = 0 , total = 0;
//    private int noOfItems;
//    private int typesOfItems;
    public List <OrderItem> orderItem = new ArrayList<OrderItem>();
    private String uuid;
    private String date;
    private String username;
    public static String resource = "src/main/resource/Order.txt";
    
    
    
    public Order() {
        setNewUUID();
    }
    
    public void addOrder(){
        DAO.append(this.toString(), resource);
    
    }
    public void setOrderItem(List <OrderItem> orderItem){
        this.orderItem = orderItem;
    }
    public void clearOrder(){
        if (!orderItem.isEmpty()){
            this.orderItem.clear();  
        }
    }

    @Override
    public String toString() {
        return this.uuid + ";" + 
                this.total + ";" + 
                this.paid + ";" + 
                this.change + ";" +
                this.date + ";" + 
                this.username;
    }
    
    
    
    public boolean cartEmpty(){
        return this.orderItem.isEmpty();
    }
    public void addOrderItem(OrderItem orderItem) {
        this.orderItem.add(orderItem);
    }
    
    public double calculateTotalprice(List<OrderItem> orderItem){
        double total = 0;
        for (OrderItem orderItem1 : orderItem){
            total = total + orderItem1.getPrice();
        }
        return total;
    }
    public double calculateChange(Order order){
        double change = -1 * (order.total - order.paid);
        return change;
    }

    public double getTotal() {
        this.total=calculateTotalprice(this.orderItem);
        return this.total;
    }
//    public int noOfItemsPurchased(List<OrderItem> orderItem){
//        int noOfItems=0;
//        for (OrderItem orderItem1 : orderItem){
//            noOfItems = noOfItems + orderItem1.getQuantity();
//        }
//        return noOfItems;
//    }
//    public int typesOfItemsPurchased(List<OrderItem> orderItem){
//        int typesOfItems = 0;
//        typesOfItems = orderItem.size();
//        return typesOfItems;
//    }    

//    public int getNoOfItems() {
//        this.noOfItems = noOfItemsPurchased(this.orderItem);
//        return this.noOfItems;
//    }
//
//    public int getTypesOfItems() {
//        this.typesOfItems = typesOfItemsPurchased(this.orderItem);
//        return this.typesOfItems;
//    }

    public double getChange() {
        this.change= calculateChange(this);
        return this.change;
    }

    public String getUuid() {
        return uuid;
    }
   
    public double getPaid() {
        return paid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
    
    public void setNewUUID(){
        this.uuid = UUID.randomUUID().toString();  
    }

    public void setPaid(double paid) {
        this.paid = paid;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    
    
    
    
}
