package main.java;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Order {
    private double paid = 0, change = 0 , total = 0;
    private List <OrderItem> orderItem = new ArrayList<>();
    private String uuid;
    private String date;
    private String username;
    public static String resourcePath = "src/main/resource/Order.txt";

    public Order(String uuid, String date, String username, double paid, double change, double total) {
        this.uuid = uuid;
        this.date = date;
        this.username = username;
        this.paid = paid;
        this.change = change;
        this.total = total;        
    }
    
    public Order() {
        setNewUuid();
    }
    
    public void addOrder(){
        DAO.append(this.toString(), resourcePath);
    }

    public static List <Order> loadOrder(){
        List <String> allOrder = DAO.readAll(resourcePath);
        List <Order> orders = new ArrayList<Order>();
        for (String line : allOrder){
            String[] orderDetails = line.split(";");
            orders.add(new Order(orderDetails[0], 
                                orderDetails[4], 
                                orderDetails[5], 
                                Double.parseDouble(orderDetails[2]), 
                                Double.parseDouble(orderDetails[3]), 
                                Double.parseDouble(orderDetails[1])));       
        }
        return orders;
    }
    public static Order getOrder(String uuid){
         List <Order> allOrders = loadOrder();
         Order matchOrder = new Order();
         for(Order order : allOrders){
             if (order.getUuid().equals(uuid)){
                 matchOrder = order;
             }
         }
         return matchOrder;
    }
    
    public void removeOrder() {
        List<String> allOrders = DAO.readAll(resourcePath);
        for(int i=0; i<allOrders.size();i++) {
            String[] orderDetails = allOrders.get(i).split(";");
            if (orderDetails[0].equals(this.getUuid())) {
                allOrders.remove(i);
                break;
            }
        }
        DAO.rewrite(allOrders, resourcePath);
    }
    
    public static List <Order> loadUserOrder(String username){
        List <Order> allOrders = loadOrder();
        List <Order> userOrders = new ArrayList<Order>();
        for (Order order: allOrders){
            if(order.username.equals(username)){
                userOrders.add(order);
            }
        }
        return userOrders;
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
                String.format("%.2f", this.total) + ";" + 
                String.format("%.2f", this.paid) + ";" + 
                String.format("%.2f", this.change) + ";" +
                this.date + ";" + 
                this.username;
    }
    public String toStringUser(){
        return (this.uuid + ";" + 
                String.format("%.2f", this.total) + ";" + 
                String.format("%.2f", this.paid) + ";" + 
                String.format("%.2f", this.change) + ";" +
                this.date);
    }
    
    public void updateProductQuantity(List <Product> productSelected){
        for (int i = 0; i< productSelected.size(); i++){
            productSelected.get(i).minusQuantity(this.orderItem.get(i).getQuantity());
            productSelected.get(i).updateProduct();
        }
    }
    
    public void addOrderItem(OrderItem orderItem) {
        this.orderItem.add(orderItem);
    }
    public boolean hasFragileProduct(List <Product> orderedProduct){
        for(Product product : orderedProduct){
            if (product.getIsFragile()){
                return true;
            }
        }
        return false;
    }
    public double calculateTotalprice(List<OrderItem> orderItem){
        double total = 0;
        for (OrderItem orderItem1 : orderItem){
            total = total + orderItem1.getTotalPrice();
        }
        return total;
    }
    public double calculateChange(Order order){
        double change = -1 * (order.total - order.paid);
        return change;
    }

    public double getAndSetTotal() {
        this.total=calculateTotalprice(this.orderItem);
        return this.total;
    }
    
    public double getAndSetChange() {
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
    
    public void setNewUuid(){
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

    public void setUsername(String username) {
        this.username = username;
    }

    public double getChange() {
        return change;
    }

    public double getTotal() {
        return total;
    }
    
    public List<OrderItem> getOrderItems() {
        return this.orderItem;
    }
}