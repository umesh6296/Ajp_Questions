package OopsConceptProject.SmartVendingMachineSystem;

import java.time.LocalDate;


public class Product {
    private int productId;
    private String name;
    private double price;
    private int quantity;
    private String category;
    private LocalDate expiryDate;

    public Product(int productId, String name, double price, int quantity, String category, LocalDate expiryDate) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
        this.expiryDate = expiryDate;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    public void display() {
        System.out.println("[" + productId + "] " + name + " - ₹" + price + " | Qty: " + quantity);
    }
}
