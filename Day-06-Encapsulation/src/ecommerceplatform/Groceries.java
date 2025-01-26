package ecommerceplatform;

public class Groceries extends Product {
    public Groceries(int productId, String name, double price) {
        super(productId, name, price);
    }

    // Implementing discount calculation for groceries (5% discount)
    @Override
    public double calculateDiscount() {
        return getPrice() * 0.05;
    }
}
