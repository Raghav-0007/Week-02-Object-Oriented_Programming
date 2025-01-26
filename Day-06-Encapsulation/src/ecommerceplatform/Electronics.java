package ecommerceplatform;

public class Electronics extends Product implements Taxable {
    public Electronics(int productId, String name, double price) {
        super(productId, name, price);
    }

    // Implementing discount calculation
    @Override
    public double calculateDiscount() {
        return getPrice() * 0.10;
    }

    // Implementing tax calculation
    @Override
    public double calculateTax() {
        return getPrice() * 0.18;
    }

    // Providing tax details for electronics
    @Override
    public String getTaxDetails() {
        return "18% GST applied";
    }
}
