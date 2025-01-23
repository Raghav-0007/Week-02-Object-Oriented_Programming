class Student {
    // Static variable shared across all students
    static String universityName = "ABC University";
    private static int totalStudents = 0;

    // Instance variables
    private String name;
    private final int rollNumber; // Final variable (cannot be changed)
    private String grade;

    // Constructor using 'this' to initialize values
    public Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;  // Increment total students count when a new student is created
    }

    // Static method to display total students
    public static void displayTotalStudents() {
        System.out.println("Total students enrolled: " + totalStudents);
    }

    // Method to display student details
    public void displayStudentDetails() {
        System.out.println("University: " + universityName);
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grade: " + grade);
    }

    // Method to update grade (if the object is an instance of Student)
    public void updateGrade(String newGrade) {
        if (this instanceof Student) {
            this.grade = newGrade;
            System.out.println("Grade updated successfully!");
        } else {
            System.out.println("Invalid operation. Object is not a Student.");
        }
    }

    public static void main(String[] args) {
        // Creating student objects
        Student s1 = new Student("Alice", 101, "A");
        Student s2 = new Student("Bob", 102, "B");

        // Display student details
        s1.displayStudentDetails();
        s2.displayStudentDetails();

        // Update grade if the object is an instance of Student
        if (s1 instanceof Student) {
            s1.updateGrade("A+");
            s1.displayStudentDetails();
        }

        // Display total students
        Student.displayTotalStudents();
    }
}

