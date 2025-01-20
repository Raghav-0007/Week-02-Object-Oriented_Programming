// Base class: Book
class Book {
    public String ISBN;          // Public member
    protected String title;      // Protected member
    private String author;       // Private member

    // Constructor to initialize book details
    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Public method to set the author name
    public void setAuthor(String author) {
        this.author = author;
    }

    // Public method to get the author name
    public String getAuthor() {
        return author;
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

// Subclass: EBook
class EBook extends Book {
    private double fileSizeMB;   // Additional attribute specific to EBook

    // Constructor to initialize EBook details
    public EBook(String ISBN, String title, String author, double fileSizeMB) {
        super(ISBN, title, author); // Call to the parent class constructor
        this.fileSizeMB = fileSizeMB;
    }

    // Method to display EBook details
    public void displayEBookDetails() {
        System.out.println("E-Book Details:");
        System.out.println("ISBN: " + ISBN);       // Accessing public member
        System.out.println("Title: " + title);     // Accessing protected member
        System.out.println("File Size: " + fileSizeMB + " MB");
    }
}

// Main class to test the Book and EBook classes
public class BookLibrarySystem {
    public static void main(String[] args) {
        // Create a Book object
        Book book = new Book("978-3-16-148410-0", "Java Programming", "John Doe");
        book.displayDetails();

        // Modify and retrieve the author name
        book.setAuthor("Jane Smith");
        System.out.println("Updated Author: " + book.getAuthor());

        // Create an EBook object
        EBook ebook = new EBook("978-1-23-456789-0", "Advanced Java", "Alice Johnson", 5.2);
        ebook.displayEBookDetails();
    }
}
