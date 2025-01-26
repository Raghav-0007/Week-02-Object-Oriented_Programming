package ecommerceplatform;

import java.util.ArrayList;
import java.util.List;

public class Main {
    // Method to calculate and print final price for a list of products (polymorphism)
    public static void calculateFinalPrice(List<Product> products) {
        for (Product product : products) {
            // Calculate discount using polymorphism
            double discount = product.calculateDiscount();

            // Calculate tax if product implements Taxable interface
            double tax = (product instanceof Taxable) ? ((Taxable) product).calculateTax() : 0;

            // Final price calculation: price + tax - discount
            double finalPrice = product.getPrice() + tax - discount;

            // Display product details
            System.out.println("Product: " + product.getName());
            System.out.println("Original Price: $" + product.getPrice());
            System.out.println("Discount: -$" + discount);
            System.out.println("Tax: +$" + tax);
            System.out.println("Final Price: $" + finalPrice);

            // Show tax details if applicable
            if (product instanceof Taxable) {
                System.out.println(((Taxable) product).getTaxDetails());
            }
            System.out.println("-----------------------------");
        }
    }

    // Main method to test the e-commerce platform functionality
    public static void main(String[] args) {
        // Creating a list of products
        List<Product> productList = new ArrayList<>();
        productList.add(new Electronics(1, "Laptop", 1000));  // Adding an electronics product
        productList.add(new Clothing(2, "T-Shirt", 50));      // Adding a clothing product
        productList.add(new Groceries(3, "Apple", 5));        // Adding a groceries product

        // Calling method to calculate final prices
        calculateFinalPrice(productList);
    }
}
