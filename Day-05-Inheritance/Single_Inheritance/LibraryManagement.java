package mypackage;
// super class
class Book{
    protected String title;
    protected String publicationYear;
    public Book(String title, String publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }
}

// sub class Author
class Author extends Book{
    private String name;
    private String bio;

    // constructor
    public Author(String name, String bio, String title, String publicationYear) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    // method to display details
    public void displayInfo(){
        System.out.println("Author name: "+name);
        System.out.println("bio: "+bio);
        System.out.println("title: "+title);
        System.out.println("publicationYear: "+publicationYear);
    }
}


    // main class
public class LibraryManagement {
    public static void main(String[] args) {
        // Create object for Author class
        Author author=new Author("abc", "jnv skcnv", "java", "1927");
        author.displayInfo();
    }
}
