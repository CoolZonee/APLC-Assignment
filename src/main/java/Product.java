package main.java;

import java.util.List;

public class Product {
    private String code, name;
    private int quantity;
    private double price;
    private boolean isNew = true;
    public static String resource = "src/main/resource/Product.txt";

    public Product() {}
    
    public Product(String code, String name, int quantity, double price) {
        this.code = code;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public static List<String> loadProduct() {
        List<String> allProduct = DAO.readAll(resource);
        return allProduct;
    }
    
    public void addProduct() {
        DAO.append(this.toString(), resource);
    }
    
    public void updateProduct() {
        List<String> allProduct = DAO.readAll(resource);
        for(int i = 0; i < allProduct.size(); i++) {
            String[] productDetails = allProduct.get(i).split(";");
            if (productDetails[0].equals(this.getCode())) {
                allProduct.set(i, this.toString());
                break;
            }
        }
        DAO.rewrite(allProduct, resource);
    }
    
    public void removeProduct() {
        List<String> allProduct = DAO.readAll(resource);
        for(int i = 0; i < allProduct.size(); i++) {
            String[] productDetails = allProduct.get(i).split(";");
            if (productDetails[0].equals(this.getCode())) {
                allProduct.remove(i);
                break;
            }
        }
        DAO.rewrite(allProduct, resource);

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
    
    public void setIsNew(boolean isNew) {
        this.isNew = isNew;
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
    
    public String toString() {
        return this.getCode() + ";"
                + this.getName() + ";"
                + String.valueOf(this.getQuantity()) + ";"
                + String.valueOf(this.getPrice());
    }
}

// productCode;Name;Quantity;Price 