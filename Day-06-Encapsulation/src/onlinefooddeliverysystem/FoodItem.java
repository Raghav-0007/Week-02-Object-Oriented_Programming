package onlinefooddeliverysystem;

public abstract class FoodItem {
    private String itemName;  // Name of the food item
    private double price;     // Price of the food item
    private int quantity;     // Quantity of the food item

    // Constructor to initialize food item details
    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Getter methods to access item details (Encapsulation)
    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Method to get food item details
    public String getItemDetails() {
        return "Item: " + itemName + ", Price: $" + price + ", Quantity: " + quantity;
    }

    // Abstract method to calculate the total price for the item (to be implemented by subclasses)
    public abstract double calculateTotalPrice();

}
