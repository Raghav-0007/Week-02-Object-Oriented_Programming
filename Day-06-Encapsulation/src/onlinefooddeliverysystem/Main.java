package onlinefooddeliverysystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a list of food items for the order
        List<FoodItem> orderItems = new ArrayList<>();
        orderItems.add(new VegItem("Vegetable Pizza", 12.99, 2));
        orderItems.add(new NonVegItem("Chicken Burger", 8.99, 3));

        // Process each food item in the order and calculate total price
        for (FoodItem item : orderItems) {
            System.out.println(item.getItemDetails());

            // Calculate and print the total price for each item
            double totalPrice = item.calculateTotalPrice();
            System.out.println("Total Price (without discount): $" + totalPrice);

            // Apply discount if the item is discountable
            if (item instanceof Discountable) {
                Discountable discountableItem = (Discountable) item;
                discountableItem.applyDiscount(10);  // Applying 10% discount for non-veg items
                System.out.println(discountableItem.getDiscountDetails());
            }

            // Final price after discount
            System.out.println("Final Price (after discount): $" + totalPrice);
            System.out.println("--------------------------------------");
        }
    }

}
