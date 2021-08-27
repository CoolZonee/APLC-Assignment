package main.java;

public class Product {
    private String code, name;
    private int quantity;
    private double price;

    public Product(String code, String name, int quantity, double price) {
        this.code = code;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }
    
    public void addQuantity(int addQuantity) {
        this.quantity += addQuantity;
    }
    
    public void minusQuantity(int minusQuantity) {
        this.quantity -= minusQuantity;
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
}

// productCode;Name;Quantity;Price 