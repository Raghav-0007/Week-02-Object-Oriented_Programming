class Student {
    // Attributes of the Student class
    String name;
    int rollNumber;
    double marks;

    // Constructor to initialize the Student object
    public Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Method to calculate the grade based on the marks
    public String calculateGrade() {
        if (marks >= 90) {
            return "A";
        } else if (marks >= 75) {
            return "B";
        } else if (marks >= 60) {
            return "C";
        } else if (marks >= 45) {
            return "D";
        } else {
            return "F";
        }
    }

    // Method to display the student's details and grade
    public void displayDetails() {
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }

    public static void main(String[] args) {
        // Create a Student object with some values
        Student student1 = new Student("John Doe", 101, 85);

        // Display the details and grade of the student
        student1.displayDetails();
    }
}

