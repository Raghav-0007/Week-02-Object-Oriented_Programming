
// Create a product class
class Product {
    // Create attributes
    private static double discount = 500;
    private String productName;
    private int quantity;
    private double price;
    private final String productID;

    // Create product class constructor
    public Product(String productName, int quantity, double price, String productID) {
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
        this.productID = productID;
    }

    // Create methos to update discount
    public static void updateDiscount(double newDiscont) {
        discount = newDiscont;
    }

}

// Create main class
public class ShoppingCart {
    public static void main(String[] args) {
        // Created object of book class
        Product obj = new Product("mobile", 3, 23000, "07638");
        System.out.println(obj instanceof Product);

        // update discount
        Product.updateDiscount(1000);
    }
}
