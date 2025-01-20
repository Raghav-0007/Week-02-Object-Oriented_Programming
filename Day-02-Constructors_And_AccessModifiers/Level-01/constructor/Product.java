// Create product class
public class Product {
    private String productName;
    private double price;
    private static int totalProducts;

    // Create a constructor of the class
    Product(String productName, double price){
        this.productName=productName;
        this.price=price;
        totalProducts++;
    }

    // Create an instance method
    public void displayProductDetails(){
        System.out.println("productName: "+productName);
        System.out.println("price: "+price);
    }

    // Create a class method
    public static void displayTotalProducts(){
        System.out.println("Total products: "+totalProducts);
    }
    public static void main(String[] args) {
        // Create class object
        Product p1=new Product("Laptop", 45000);
        p1.displayProductDetails();
        Product p2=new Product("mobile", 15400);
        p2.displayProductDetails();
        displayTotalProducts();
    }
}
