import java.util.ArrayList;

// Book class with attributes title and author
class Book {
    private String title;
    private String author;

    // Constructor to initialize book details
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Display book details
    public void displayBookDetails() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

// Library class with a list of books (Aggregation)
class Library {
    private String libraryName;
    private ArrayList<Book> books;

    // Constructor to initialize library name and book list
    public Library(String libraryName) {
        this.libraryName = libraryName;
        this.books = new ArrayList<>();
    }

    // Method to add a book to the library
    public void addBook(Book book) {
        books.add(book);
    }

    // Display all books in the library
    public void displayLibraryBooks() {
        System.out.println("Library: " + libraryName);
        if (books.isEmpty()) {
            System.out.println("No books available.");
        } else {
            for (Book book : books) {
                book.displayBookDetails();
            }
        }
    }
}

// Main class to demonstrate aggregation
public class LibraryManagement {
    public static void main(String[] args) {
        // Create book objects (can exist independently)
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");
        Book book3 = new Book("1984", "George Orwell");

        // Create library objects
        Library library1 = new Library("City Library");
        Library library2 = new Library("Community Library");

        // Add books to different libraries
        library1.addBook(book1);
        library1.addBook(book2);

        library2.addBook(book2);
        library2.addBook(book3);

        // Display books in each library
        library1.displayLibraryBooks();
        library2.displayLibraryBooks();
    }
}
