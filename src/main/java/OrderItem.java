package main.java;

import java.util.ArrayList;
import java.util.List;

public class OrderItem {
    private String code, name;
    int quantity;
    double price;
    double totalPrice;
    Product currentProduct;
    String orderUuid;
    public String quantityInvalidMessage;
    private static String resourcePath = "src/main/resource/OrderItem.txt";
    
    public OrderItem() {
    }
    public OrderItem(OrderItem orderItem) {
        this.code = orderItem.getCode();
        this.name = orderItem.getName();
        this.quantity = orderItem.getQuantity();
        this.price = orderItem.getPrice();
        this.totalPrice = orderItem.getTotalPrice();
    }

    public OrderItem(String uuid, String code, String name, int quantity, double price) {
        this.orderUuid = uuid;
        this.code = code;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.totalPrice = quantity * price;
    }
    
    public static List <OrderItem> loadOrderItem(){
        List <String> allOrderItems = DAO.readAll(resourcePath);
        List <OrderItem> orderItems = new ArrayList<OrderItem>();
        for (String line : allOrderItems){
            String[] orderItemDetails = line.split(";");
            orderItems.add(new OrderItem(orderItemDetails[0], 
                                orderItemDetails[1], 
                                orderItemDetails[2], 
                                Integer.parseInt(orderItemDetails[3]), 
                                Double.parseDouble(orderItemDetails[4])));       
        }
        return orderItems;
    }
    
    public static List <OrderItem> loadUuidOrderItem(String uuid){
        List <OrderItem> allOrderItems = loadOrderItem();
        List <OrderItem> uuidOrderItem = new ArrayList<OrderItem>();
        for (OrderItem orderItem : allOrderItems){
            if (orderItem.getOrderUuid().equals(uuid)){
                uuidOrderItem.add(orderItem);
            }
        }
        return uuidOrderItem;
    }
    public void addOrderItem(){
        DAO.append(this.toString(),resourcePath);
    }

    @Override
    public String toString() {
        return this.orderUuid + ";" 
                    + this.code + ";" + 
                    this.name + ";" +
                    this.quantity + ";" +
                    String.format("%.2f", this.price);
                    
        
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }
    
    public double getTotalPrice() {
        return totalPrice;
    }

    public String getOrderUuid() {
        return orderUuid;
    }

    public String getQuantityInvalidMessage() {
        return quantityInvalidMessage;
    }
    
     
}



