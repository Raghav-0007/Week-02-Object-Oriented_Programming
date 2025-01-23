
// Create a book class
class Book {
    // Create attributes
    private static String libraryName="myLibrary";
    private String title;
    private String author;
    private final String isbn;

    // Create Book class constructor
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Create methos to display Library name
    public static void displayLibraryName() {
        System.out.println("libraryName is: " + libraryName);
    }
}

// Create main  class
public class LibraryManagement {
    public static void main(String[] args) {
        // Created object of book class
        Book obj=new Book("java", "xyz", "105");
        System.out.println(obj instanceof Book);
        Book.displayLibraryName();
    }
}
