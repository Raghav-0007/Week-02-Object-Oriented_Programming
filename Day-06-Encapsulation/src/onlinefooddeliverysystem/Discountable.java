package onlinefooddeliverysystem;

public interface Discountable {
    void applyDiscount(double percentage);  // Apply discount to the item
    String getDiscountDetails();            // Get details about the applied discount
}
