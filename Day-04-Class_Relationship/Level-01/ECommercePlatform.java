import java.util.ArrayList;
import java.util.List;

// Product class
class Product {
    private String productName;
    private double price;

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }
}

// Order class
class Order {
    private int orderId;
    private List<Product> products;

    public Order(int orderId) {
        this.orderId = orderId;
        this.products = new ArrayList<>();
    }

    // Add product to order
    public void addProduct(Product product) {
        products.add(product);
    }

    // Display order details
    public void showOrderDetails() {
        System.out.println("Order ID: " + orderId);
        double total = 0;
        for (Product product : products) {
            System.out.println("- " + product.getProductName() + ": $" + product.getPrice());
            total += product.getPrice();
        }
        System.out.println("Total Amount: $" + total);
    }
}

// Customer class
class Customer {
    private String customerName;
    private List<Order> orders;

    public Customer(String customerName) {
        this.customerName = customerName;
        this.orders = new ArrayList<>();
    }

    // Place an order
    public void placeOrder(Order order) {
        orders.add(order);
        System.out.println(customerName + " placed an order with ID: " + order);
    }

    // Display customer orders
    public void showCustomerOrders() {
        System.out.println(customerName + "'s Orders:");
        for (Order order : orders) {
            order.showOrderDetails();
        }
    }
}

// Main class to test the system
public class ECommercePlatform {
    public static void main(String[] args) {
        // Create customers
        Customer customer1 = new Customer("Alice");
        Customer customer2 = new Customer("Bob");

        // Create products
        Product product1 = new Product("Laptop", 1000.00);
        Product product2 = new Product("Phone", 500.00);
        Product product3 = new Product("Headphones", 100.00);

        // Create orders and add products
        Order order1 = new Order(101);
        order1.addProduct(product1);
        order1.addProduct(product2);

        Order order2 = new Order(102);
        order2.addProduct(product3);

        // Customers placing orders
        customer1.placeOrder(order1);
        customer2.placeOrder(order2);

        // Display all customer orders
        customer1.showCustomerOrders();
        customer2.showCustomerOrders();
    }
}

