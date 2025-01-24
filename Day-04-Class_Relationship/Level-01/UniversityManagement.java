import java.util.ArrayList;
import java.util.List;

// Course class
class Course {
    private String courseName;
    private Professor professor;
    private List<Student> enrolledStudents = new ArrayList<>();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    // Assign professor to the course (Association)
    public void assignProfessor(Professor professor) {
        this.professor = professor;
    }

    // Enroll a student in the course (Aggregation)
    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
    }

    public void displayCourseDetails() {
        System.out.println("Course: " + courseName);
        if (professor != null) {
            System.out.println("Professor: " + professor.getName());
        }
        System.out.println("Enrolled Students:");
        for (Student student : enrolledStudents) {
            System.out.println(" - " + student.getName());
        }
    }
}

// Student class
class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Enroll in a course
    public void enrollCourse(Course course) {
        course.enrollStudent(this);
        System.out.println(name + " enrolled in " + course);
    }
}

// Professor class
class Professor {
    private String name;

    public Professor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Assign professor to a course
    public void assignCourse(Course course) {
        course.assignProfessor(this);
        System.out.println(name + " assigned to teach " + course);
    }
}

// Main class to demonstrate the University Management System
public class UniversityManagement {
    public static void main(String[] args) {
        // Create courses
        Course course1 = new Course("Mathematics");
        Course course2 = new Course("Computer Science");

        // Create students
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        // Create professors
        Professor professor1 = new Professor("Dr. Smith");
        Professor professor2 = new Professor("Dr. Johnson");

        // Assign professors to courses
        professor1.assignCourse(course1);
        professor2.assignCourse(course2);

        // Enroll students in courses
        student1.enrollCourse(course1);
        student2.enrollCourse(course2);
        student2.enrollCourse(course1);

        // Display course details
        course1.displayCourseDetails();
        course2.displayCourseDetails();
    }
}

