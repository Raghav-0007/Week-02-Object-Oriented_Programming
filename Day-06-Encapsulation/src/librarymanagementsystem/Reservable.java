package librarymanagementsystem;

public interface Reservable {
    void reserveItem();          // Reserve the item
    boolean checkAvailability(); // Check if the item is available for reservation
}
