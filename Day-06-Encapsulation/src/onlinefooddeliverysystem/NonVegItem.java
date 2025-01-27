package onlinefooddeliverysystem;

public class NonVegItem extends FoodItem implements Discountable{
    private double totalPrice;  // To store the total price after calculation
    private double discount;    // Discount percentage
    private double discountAmount;  // Amount after applying discount

    // Constructor to initialize NonVegItem details
    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    // Implement calculateTotalPrice for NonVegItem (including additional charges)
    @Override
    public double calculateTotalPrice() {
        totalPrice = getPrice() * getQuantity();
        // Additional charge for non-veg items
        totalPrice += 2.5 * getQuantity();  // Assuming $2.5 extra charge for each non-veg item
        return totalPrice;
    }

    // Implement applyDiscount method for non-veg items
    @Override
    public void applyDiscount(double percentage) {
        discount = percentage;
        discountAmount = (totalPrice * discount) / 100;
        totalPrice -= discountAmount;
    }

    // Implement getDiscountDetails method for non-veg items
    @Override
    public String getDiscountDetails() {
        return "Discount applied: " + discount + "%, Discount Amount: $" + discountAmount;
    }
}
