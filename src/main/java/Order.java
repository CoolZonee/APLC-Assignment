package main.java;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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
        
        return allOrder.stream()
                .map(line -> 
            line.split(";"))
                .map(order -> 
                new Order(
                    order[0],
                    order[4],
                    order[5],
                    Double.parseDouble(order[2]), 
                    Double.parseDouble(order[3]), 
                    Double.parseDouble(order[1]))
                ).toList();
            
  
        
//        return orders;
    }
    public static Order getOrder(String uuid){
        return loadOrder().stream()
                .filter(order -> order.getUuid().equals(uuid))
                .findFirst()
                .get();
    }
    
    public void removeOrder() {
        List<String> allOrders = DAO.readAll(resourcePath);
        
        var removed = allOrders.stream()
                .filter(order -> 
                    !List.of(order.split(";"))
                        .stream()
                        .findFirst().get().equals(this.getUuid()))
                .collect(Collectors.toList());
            
        DAO.rewrite(removed, resourcePath);
    }
    
    public static List <Order> loadUserOrder(String username){
        return loadOrder().stream()
                .filter(order -> 
                        order.username.equals(username))
                .collect(Collectors.toList());
    }
    
    public static BiFunction<Order, List<Order>, Order> mostSpentOrder = 
            (mostSpent, order) -> order.size() < 2 // if the list size is less than 2
                    // compare 2 only as the list has only 2 elements
                ? order.get(0).getTotal() > mostSpent.getTotal() 
                    ? order.get(0)
                    : mostSpent
                : order.get(0).getTotal() > mostSpent.getTotal()
                    ? Order.mostSpentOrder.apply(
                            // change the most spent to the current element
                            order.get(0), 
                            // remove and the first element and continue
                            // comparing with the following elemennt
                            order.subList(1, order.size())) 
                    : Order.mostSpentOrder.apply(
                            // remain the most spent
                            mostSpent, 
                            // remove and the first element and continue
                            // comparing with the following elemennt
                            order.subList(1, order.size()));
    
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
        IntStream.range(0, productSelected.size())
                .forEach(i -> {
                    productSelected.get(i).minusQuantity(this.orderItem.get(i).getQuantity());
                    productSelected.get(i).updateProduct();
                });
    }
    
    public void addOrderItem(OrderItem orderItem) {
        this.orderItem.add(orderItem);
    }
    
    public boolean hasFragileProduct(List <Product> orderedProduct){
        return orderedProduct.stream()
                .anyMatch(product -> product.getIsFragile());
    }
    
    public double calculateTotalprice(List<OrderItem> orderItem){
        return Utils.doubleCalculateTotal(orderItem.stream()
                .map(item -> item.getTotalPrice())
                .collect(Collectors.toList()));
    }
    
    public double calculateChange(Order order){
        return Utils.minus.apply(order.getPaid()).apply(order.getTotal());
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