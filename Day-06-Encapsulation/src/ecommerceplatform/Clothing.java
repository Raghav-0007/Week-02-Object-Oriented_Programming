package ecommerceplatform;

public class Clothing extends Product implements Taxable{
    public Clothing(int productId, String name, double price) {
        super(productId, name, price);
    }

    // Implementing discount calculation for clothing (20% discount)
    @Override
    public double calculateDiscount() {
        return getPrice() * 0.20;
    }

    // Implementing tax calculation for clothing (12% tax)
    @Override
    public double calculateTax() {
        return getPrice() * 0.12;
    }

    // Providing tax details for clothing
    @Override
    public String getTaxDetails() {
        return "12% GST applied";
    }
}
