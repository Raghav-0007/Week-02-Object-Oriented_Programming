// Base class: Student
class Student {
    public int rollNumber;       // Public member
    protected String name;       // Protected member
    private double CGPA;         // Private member

    // Constructor to initialize student details
    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // Public method to access CGPA
    public double getCGPA() {
        return CGPA;
    }

    // Public method to modify CGPA
    public void setCGPA(double CGPA) {
        if (CGPA >= 0 && CGPA <= 10) {
            this.CGPA = CGPA;
        } else {
            System.out.println("Invalid CGPA. Please enter a value between 0 and 10.");
        }
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }
}

// Subclass: PostgraduateStudent
class PostgraduateStudent extends Student {

    private String researchTopic;  // Additional attribute for postgraduate students

    // Constructor to initialize postgraduate student details
    public PostgraduateStudent(int rollNumber, String name, double CGPA, String researchTopic) {
        super(rollNumber, name, CGPA); // Call superclass constructor
        this.researchTopic = researchTopic;
    }

    // Method to display postgraduate student details
    public void displayPostgraduateDetails() {
        System.out.println("Postgraduate Student Details:");
        displayDetails(); // Call superclass method
        System.out.println("Research Topic: " + researchTopic);
    }
}

// Main class to test the University Management System
public class UniversityManagementSystem {
    public static void main(String[] args) {
        // Create a Student object
        Student student = new Student(101, "Alice", 8.5);
        student.displayDetails();

        // Modify CGPA using public method
        student.setCGPA(9.2);
        System.out.println("\nUpdated Student Details:");
        student.displayDetails();

        // Create a PostgraduateStudent object
        PostgraduateStudent postgrad = new PostgraduateStudent(201, "Bob", 9.0, "Artificial Intelligence");
        System.out.println("\nPostgraduate Student Details:");
        postgrad.displayPostgraduateDetails();

        // Access protected member from subclass
        System.out.println("\nAccessing protected name from subclass: " + postgrad.name);
    }
}
