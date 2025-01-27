package onlinefooddeliverysystem;

public class VegItem extends FoodItem {
    private double totalPrice;  // To store the total price after calculation

    // Constructor to initialize VegItem details
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    // Implement calculateTotalPrice for VegItem (no additional charges)
    @Override
    public double calculateTotalPrice() {
        totalPrice = getPrice() * getQuantity();
        return totalPrice;
    }

}
