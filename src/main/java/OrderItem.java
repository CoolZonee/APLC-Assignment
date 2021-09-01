package main.java;

import java.util.ArrayList;
import java.util.List;



public class OrderItem {
    private String code, name;
    int quantity;
    double price;
    Product currentProduct;
    String orderUuid;
    public String quantityInvalidMessage;
    private static String resource = "src/main/resource/OrderItem.txt";
    
    public OrderItem() {
    }
    public OrderItem(OrderItem orderItem) {
        this.code = orderItem.getCode();
        this.name = orderItem.getName();
        this.quantity = orderItem.getQuantity();
        this.price = orderItem.getPrice();
    }

    public OrderItem(String uuid, String code, String name, int quantity, double price) {
        this.orderUuid = uuid;
        this.code = code;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }
    public static List <OrderItem> loadOrderItem(){
        List <String> allOrderItems = DAO.readAll(resource);
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
        DAO.append(this.toString(),resource);
    }

//    public void checkProductQuantity(DefaultTableModel tableModel){
//        String quantity =(String) tableModel.getValueAt(1, 2);
//        int quantity1= Integer.parseInt(quantity);
//        System.out.println(quantity1);
//    }
    
    //check product quantity
    
    
//    public void resetQuantityCheck(){
//        this.quantityInvalidMessage="";
//    }
    
    
//    public boolean checkProductQuantity(DefaultTableModel tableModel, int row){
//        //for (int i=0;i < tableModel.getRowCount();i++){
//        for(Product productCheck: product){
//            if(tableModel.getValueAt(row, 0).toString().equals(productCheck.getName())){
//                String quantityString = tableModel.getValueAt(row, 2).toString();
//                int quantityTable= Integer.parseInt(quantityString);
//                if (quantityTable>productCheck.getQuantity()){
//                    this.quantityInvalidMessage = (this.quantityInvalidMessage +
//                                                    "The available quantity for: " + 
//                                                    productCheck.getName() + 
//                                                    " is: " + productCheck.getQuantity()
//                                                    + "\n");
//                    return false;
//                }else{
//                    this.code = productCheck.getCode();
//                    this.name = productCheck.getName();
//                    this.quantity = quantityTable;
//                    this.price = (productCheck.getPrice() * this.quantity);
//                    return true;                   
//                }
//
//            }
//        }
//        
//        return true;
//    }

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

    public String getOrderUuid() {
        return orderUuid;
    }
    
//    public OrderItem[] createOrderItem(){
//        
//    }
//    public void setCurrentProduct(Product product){
//        this.currentProduct=product;
//    }
//    
//    public Product getCurrentProduct(){
//        return this.currentProduct;
//    }
    public String getQuantityInvalidMessage() {
        return quantityInvalidMessage;
    }
    
    
    
}



