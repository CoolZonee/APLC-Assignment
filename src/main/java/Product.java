package main.java;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Product implements CheckRecord {
    private String code, name;
    private int quantity;
    private double price;
    private boolean isNew = true;
    private boolean isFragile;
    public static String resourcePath = "src/main/resource/Product.txt";

    public Product() {}
    
    public Product(String code, String name, int quantity, double price, boolean isFragile) {
        this.code = code;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.isFragile = isFragile;
    }

    public static List<Product> loadProduct() {
        List<String> allProduct = DAO.readAll(resourcePath);
        List<Product> products = new ArrayList<>();
        
        return allProduct.stream()
                .map(line -> 
                    line.split(";")
                )
                .map(details ->
                    new Product(
                            details[0], 
                            details[1], 
                            Integer.parseInt(details[2]), 
                            Double.parseDouble(details[3]),
                            Boolean.parseBoolean(details[4]))
                )
                .collect(Collectors.toList());
    }
    
    public void addProduct() {
        DAO.append(this.toString(), resourcePath);
    }
    
    public void updateProduct() {
        List<String> allProduct = DAO.readAll(resourcePath)
                .stream()
                .map(s -> {
                    return List.of(s.split(";")). // split the line into product details
                            stream().findFirst() // get the line[0], which is product code
                            .get()
                            .equals(this.getCode())  
                                ? this.toString() // if product code matched, update details
                                : s;
                })
                .collect(Collectors.toList());
        
        DAO.rewrite(allProduct, resourcePath);
    }
    
    @Override
    public boolean checkIfRecordExist(String code) {
        return !loadProduct().stream()
                .anyMatch(product -> 
                    product.getCode().equals(code)
                );
    }
    
    public void removeProduct() {
        List<String> allProduct = DAO.readAll(resourcePath);
        
        var toRemove = allProduct.stream()
                .filter(product -> // if product code matched, product is removed using filter
                    !List.of(product.split(";")) // split the line into product details
                        .stream().findFirst() // get the line[0], which is product code
                        .get()
                        .equals(this.getCode()))      
                .collect(Collectors.toList());
        
        DAO.rewrite(toRemove, resourcePath);
    }
    
    public void addQuantity (int quantity) {
        this.quantity += quantity;
    }

    public void minusQuantity (int quantity) {
        this.quantity -= quantity;
    }
   
    
    // Setter
    public void setCode(String code) {
        this.code = code;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public void setIsNew(boolean isNew) {
        this.isNew = isNew;
    }

    public void setIsFragile(boolean isFragile) {
        this.isFragile = isFragile;
    }
    
    // Getter
    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
    
    public int getQuantity() {
        return this.quantity;
    }

    public double getPrice() {
        return this.price;
    }
    
    public boolean getIsNew() {
        return this.isNew;
    }
    
    public boolean getIsFragile() {
        return this.isFragile;
    }
    
    @Override
    public String toString() {
        return this.getCode() + ";"
                + this.getName() + ";"
                + String.valueOf(this.getQuantity()) + ";"
                + String.valueOf(this.getPrice()) + ";"
                + String.valueOf(this.getIsFragile());
    }
}
