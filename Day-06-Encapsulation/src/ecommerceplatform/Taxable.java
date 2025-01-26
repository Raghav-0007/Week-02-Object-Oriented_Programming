package ecommerceplatform;

public interface Taxable {
    // Method to calculate tax for the product
    double calculateTax();

    // Method to get tax details for the product
    String getTaxDetails();
}
