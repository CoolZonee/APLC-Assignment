package main.java;

import java.util.ArrayList;
import java.util.List;

public class Product implements CheckRecord {
    private String code, name;
    private int quantity;
    private double price;
    private boolean isNew = true;
    private boolean isFragile;
    public static String resource = "src/main/resource/Product.txt";

    public Product() {}
    
    public Product(String code, String name, int quantity, double price, boolean isFragile) {
        this.code = code;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.isFragile = isFragile;
    }

    public static List<Product> loadProduct() {
        List<String> allProduct = DAO.readAll(resource);
        List<Product> products = new ArrayList<>();
        for (String line: allProduct) {              
            String[] details = line.split(";");
            products.add(new Product(
                    details[0], 
                    details[1], 
                    Integer.parseInt(details[2]), 
                    Double.parseDouble(details[3]),
                    Boolean.parseBoolean(details[4])
                )
            );
        }
        return products;
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
    
    @Override
    public boolean checkIfRecordExist(String code) {
        List<Product> productList = loadProduct();
        boolean valid = true;
        for (Product p: productList) {
            if (p.getCode().equals(code)) {
                valid = false;
            }
        }
        return valid;
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

// productCode;Name;Quantity;Price 
