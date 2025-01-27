package librarymanagementsystem;

public class Magazine extends LibraryItem{
    // Constructor to initialize magazine details
    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    // Implement loan duration for magazines (7 days)
    @Override
    public int getLoanDuration() {
        return 7;
    }
}
