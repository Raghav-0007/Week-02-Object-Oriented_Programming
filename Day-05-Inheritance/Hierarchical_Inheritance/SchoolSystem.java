// Base class representing a generic person in the school system
class Person {
    protected String name;  // Person's name
    protected int age;      // Person's age

    // Constructor to initialize name and age
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display basic information
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Subclass representing a teacher with a subject specialization
class Teacher extends Person {
    private String subject;  // Subject taught by the teacher

    // Constructor to initialize teacher's attributes
    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    // Method to display the teacher's role and subject
    public void displayRole() {
        System.out.println(name + " is a Teacher, teaching " + subject);
    }
}

// Subclass representing a student with a grade level
class Student extends Person {
    private String grade;  // Grade level of the student

    // Constructor to initialize student's attributes
    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    // Method to display the student's role and grade
    public void displayRole() {
        System.out.println(name + " is a Student in grade " + grade);
    }
}

// Subclass representing a staff member with a job title
class Staff extends Person {
    private String jobTitle;  // Job title of the staff member

    // Constructor to initialize staff's attributes
    public Staff(String name, int age, String jobTitle) {
        super(name, age);
        this.jobTitle = jobTitle;
    }

    // Method to display the staff's role and job title
    public void displayRole() {
        System.out.println(name + " is a Staff member working as a " + jobTitle);
    }
}

// Main class to test the school system roles
public class SchoolSystem {
    public static void main(String[] args) {
        // Creating a teacher object
        Teacher teacher = new Teacher("Mr. Smith", 40, "Mathematics");
        teacher.displayInfo();
        teacher.displayRole();

        // Creating a student object
        Student student = new Student("Alice", 15, "10th Grade");
        student.displayInfo();
        student.displayRole();

        // Creating a staff object
        Staff staff = new Staff("Mrs. Johnson", 35, "Librarian");
        staff.displayInfo();
        staff.displayRole();
    }
}

