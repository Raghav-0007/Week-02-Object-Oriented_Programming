class MovieTicket {
    // Attributes of the MovieTicket class
    private String movieName;
    private String seatNumber;
    private double price;

    // Constructor to initialize ticket details
    public MovieTicket(String movieName) {
        this.movieName = movieName;
        this.seatNumber = "Not Booked"; // Initially, seat is not booked
        this.price = 0.0; // Price is set to 0 until ticket is booked
    }

    // Method to book the ticket (assign seat and price)
    public void bookTicket(String seatNumber, double price) {
        this.seatNumber = seatNumber; // Assign the seat number
        this.price = price; // Set the price for the ticket
    }

    // Method to display ticket details
    public void displayTicketDetails() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: $" + price);
    }

    // Main method to test the MovieTicket class
    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket("Avengers: Endgame"); // Creating a ticket for a movie
        ticket.bookTicket("A12", 15.50); // Booking the ticket for seat A12 with a price of $15.50
        ticket.displayTicketDetails(); // Displaying the ticket details
    }
}
