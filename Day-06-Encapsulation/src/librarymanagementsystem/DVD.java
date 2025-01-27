package librarymanagementsystem;

public class DVD extends LibraryItem implements Reservable{
    private boolean isReserved; // Encapsulated reservation status

    // Constructor to initialize DVD details
    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
        this.isReserved = false;
    }

    // Implement loan duration for DVDs (5 days)
    @Override
    public int getLoanDuration() {
        return 5;
    }

    // Reserve the DVD
    @Override
    public void reserveItem() {
        if (!isReserved) {
            isReserved = true;
            System.out.println("DVD '" + getTitle() + "' has been reserved.");
        } else {
            System.out.println("DVD '" + getTitle() + "' is already reserved.");
        }
    }

    // Check availability of the DVD
    @Override
    public boolean checkAvailability() {
        return !isReserved;
    }
}
