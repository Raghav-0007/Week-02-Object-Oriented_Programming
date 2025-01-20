
// Book class with attributes and borrow method
class Book {
    private String title;
    private String author;
    private double price;
    private boolean isAvailable;

    // Constructor to initialize book details
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = true;  // Book is available by default
    }

    // Method to borrow the book
    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("You have borrowed: " + title + " by " + author);
        } else {
            System.out.println("Sorry, " + title + " is currently unavailable.");
        }
    }

    // Method to display book details
    public void displayDetails() {
        String status = isAvailable ? "Available" : "Not Available";
        System.out.println("Title: " + title + " | Author: " + author + " | Price: $" + price + " | Status: " + status);
    }
}

// Main class to test the Book class
public class LibrarySystem {
    public static void main(String[] args) {
        // Create book objects
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 10.99);
        Book book2 = new Book("1984", "George Orwell", 8.99);

        // Display book details
        book1.displayDetails();
        book2.displayDetails();

        // Borrow a book
        book1.borrowBook();  // First attempt - should succeed
        book1.borrowBook();  // Second attempt - should fail

        // Display updated book details
        book1.displayDetails();
    }
}
