package librarymanagementsystem;

public abstract class LibraryItem {
    private String itemId;  // Unique item ID
    private String title;   // Title of the item
    private String author;  // Author of the item

    // Constructor to initialize library item details
    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    // Getter methods to access item details (Encapsulation)
    public String getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    // Concrete method to get item details
    public String getItemDetails() {
        return "ID: " + itemId + ", Title: " + title + ", Author: " + author;
    }

    // Abstract method to be implemented by subclasses for loan duration
    public abstract int getLoanDuration();

}
