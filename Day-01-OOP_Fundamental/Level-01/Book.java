
// create a Book class
class Book {
    String title;
    String author;
    int price;

    // book class constructor for taking value
    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    };

    // method to display the book details
    public void displayDetails() {
        System.out.println("Book detailes......");
        System.out.println("The title of book is: " + title);
        System.out.println("The author of book is: " + author);
        System.out.println("The price of book is: " + price);
    };

    // main method
    public static void main(String[] args) {
        Book obj = new Book("java", "null", 500);
        obj.displayDetails();
    }
}
