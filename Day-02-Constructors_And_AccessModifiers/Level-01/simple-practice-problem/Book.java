// Create a book class
public class Book {
    private String title;
    private String author;
    private double price;

    // Default constractor
    Book(){
        title="Beloved";
        author="Toni morrison";
        price=1200;
    }

    // parameterized constractor
    Book(String title, String author, double price){
        this.title=title;
        this.author=author;
        this.price=price;
    }

    // display the details
    public void displayDetails(){
        System.out.println("title: "+this.title+",  author: "+this.author+",  price: "+price);
    }
    public static void main(String[] args) {
        // Create objects
        Book obj1=new Book();
        obj1.displayDetails();
        Book obj2=new Book("Kadambari", "Bana", 560);
        obj2.displayDetails();
    }
}