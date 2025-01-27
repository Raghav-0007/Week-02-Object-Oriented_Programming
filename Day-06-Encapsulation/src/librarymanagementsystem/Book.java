package librarymanagementsystem;

public class Book extends LibraryItem implements Reservable{
    private boolean isReserved; // Encapsulated reservation status

    // Constructor to initialize book details
    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
        this.isReserved = false;
    }

    // Implement loan duration for books (14 days)
    @Override
    public int getLoanDuration() {
        return 14;
    }

    // Reserve the book
    @Override
    public void reserveItem() {
        if (!isReserved) {
            isReserved = true;
            System.out.println("Book '" + getTitle() + "' has been reserved.");
        } else {
            System.out.println("Book '" + getTitle() + "' is already reserved.");
        }
    }

    // Check availability of the book
    @Override
    public boolean checkAvailability() {
        return !isReserved;
    }

}
