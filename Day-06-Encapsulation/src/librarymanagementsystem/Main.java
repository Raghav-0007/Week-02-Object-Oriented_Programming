package librarymanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Creating a list of library items
        List<LibraryItem> libraryItems = new ArrayList<>();
        libraryItems.add(new Book("B001", "The Great Gatsby", "F. Scott Fitzgerald"));
        libraryItems.add(new Magazine("M001", "National Geographic", "Various"));
        libraryItems.add(new DVD("D001", "Inception", "Christopher Nolan"));

        // Processing each library item dynamically using polymorphism
        for (LibraryItem item : libraryItems) {
            System.out.println(item.getItemDetails());
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

            // Handling reservation for reservable items
            if (item instanceof Reservable) {
                Reservable reservableItem = (Reservable) item;
                if (reservableItem.checkAvailability()) {
                    reservableItem.reserveItem();
                } else {
                    System.out.println("Item '" + item.getTitle() + "' is not available for reservation.");
                }
            }

            System.out.println("----------------------------------");
        }
    }
}
