package ecommerceplatform;

public abstract class Product {
    private int productId;   // Unique product ID
    private String name;     // Product name
    private double price;    // Product price

    // Constructor to initialize product details
    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    // Getter methods to access product details
    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // Setter methods to update product details (encapsulation)
    public void setPrice(double price) {
        if (price > 0) {  // Ensuring price is valid
            this.price = price;
        }
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {  // Ensuring name is not empty
            this.name = name;
        }
    }

    // Abstract method to be implemented by subclasses for discount calculation
    public abstract double calculateDiscount();
}

