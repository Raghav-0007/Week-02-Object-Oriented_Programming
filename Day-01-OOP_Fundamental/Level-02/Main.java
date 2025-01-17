import java.util.ArrayList;

class CartItem {
    // Attributes for the CartItem class
    private String itemName;
    private double price;
    private int quantity;

    // Constructor to initialize CartItem details
    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters for CartItem attributes
    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Method to calculate total cost of the item
    public double getTotalCost() {
        return price * quantity;
    }
}

class ShoppingCart {
    // List to store cart items
    private ArrayList<CartItem> cartItems;

    // Constructor to initialize the cart
    public ShoppingCart() {
        cartItems = new ArrayList<>();
    }

    // Method to add an item to the cart
    public void addItem(CartItem item) {
        cartItems.add(item);
    }

    // Method to remove an item from the cart
    public void removeItem(String itemName) {
        for (CartItem item : cartItems) {
            if (item.getItemName().equals(itemName)) {
                cartItems.remove(item);
                break;
            }
        }
    }

    // Method to calculate the total cost of items in the cart
    public double getTotalCost() {
        double totalCost = 0;
        for (CartItem item : cartItems) {
            totalCost += item.getTotalCost();
        }
        return totalCost;
    }

    // Method to display the details of all items in the cart
    public void displayCartDetails() {
        if (cartItems.isEmpty()) {
            System.out.println("Your cart is empty.");
            return;
        }
        for (CartItem item : cartItems) {
            System.out.println("Item: " + item.getItemName() + ", Price: $" + item.getPrice() + ", Quantity: " + item.getQuantity() + ", Total: $" + item.getTotalCost());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Create shopping cart
        ShoppingCart cart = new ShoppingCart();

        // Create CartItem objects
        CartItem item1 = new CartItem("Laptop", 1000.0, 1);
        CartItem item2 = new CartItem("Phone", 500.0, 2);
        CartItem item3 = new CartItem("Headphones", 100.0, 3);

        // Add items to the cart
        cart.addItem(item1);
        cart.addItem(item2);
        cart.addItem(item3);

        // Display cart details
        System.out.println("Cart Details:");
        cart.displayCartDetails();

        // Display total cost
        System.out.println("\nTotal Cost: $" + cart.getTotalCost());

        // Remove an item from the cart
        cart.removeItem("Phone");

        // Display updated cart details
        System.out.println("\nUpdated Cart Details:");
        cart.displayCartDetails();

        // Display updated total cost
        System.out.println("\nUpdated Total Cost: $" + cart.getTotalCost());
    }
}
