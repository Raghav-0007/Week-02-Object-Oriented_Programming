import java.util.ArrayList;
import java.util.List;

// Course class representing the association with Student
class Course {
    private String courseName;
    private List<Student> enrolledStudents;

    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    // Enroll a student in the course
    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
    }

    // Display students enrolled in the course
    public void displayEnrolledStudents() {
        System.out.println("Course: " + courseName + " has the following students enrolled:");
        for (Student student : enrolledStudents) {
            System.out.println("- " + student.getName());
        }
    }

    public String getCourseName() {
        return courseName;
    }
}

// Student class representing the association with Course
class Student {
    private String name;
    private int studentID;
    private List<Course> courses;

    public Student(String name, int studentID) {
        this.name = name;
        this.studentID = studentID;
        this.courses = new ArrayList<>();
    }

    // Enroll in a course
    public void enrollInCourse(Course course) {
        courses.add(course);
        course.enrollStudent(this);
    }

    // Display enrolled courses
    public void displayCourses() {
        System.out.println("Student: " + name + " is enrolled in:");
        for (Course course : courses) {
            System.out.println("- " + course.getCourseName());
        }
    }

    public String getName() {
        return name;
    }
}

// School class representing aggregation with Student
class School {
    private String schoolName;
    private List<Student> students;

    public School(String schoolName) {
        this.schoolName = schoolName;
        this.students = new ArrayList<>();
    }

    // Add student to the school
    public void addStudent(Student student) {
        students.add(student);
    }

    // Display all students in the school
    public void displayStudents() {
        System.out.println("Students at " + schoolName + ":");
        for (Student student : students) {
            System.out.println("- " + student.getName());
        }
    }
}

// Main class to demonstrate the relationships
public class SchoolManagementSystem {
    public static void main(String[] args) {
        // Create school
        School school = new School("Greenwood High");

        // Create students
        Student student1 = new Student("Alice", 101);
        Student student2 = new Student("Bob", 102);

        // Add students to the school (Aggregation)
        school.addStudent(student1);
        school.addStudent(student2);

        // Create courses
        Course math = new Course("Mathematics");
        Course science = new Course("Science");

        // Students enrolling in courses (Association)
        student1.enrollInCourse(math);
        student1.enrollInCourse(science);

        student2.enrollInCourse(math);

        // Display school students
        school.displayStudents();

        // Display student courses
        student1.displayCourses();
        student2.displayCourses();

        // Display course enrollments
        math.displayEnrolledStudents();
        science.displayEnrolledStudents();
    }
}

