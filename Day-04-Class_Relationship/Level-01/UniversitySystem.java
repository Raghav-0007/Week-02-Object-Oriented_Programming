import java.util.ArrayList;
import java.util.List;

// Department class (Composition: Exists only within the University)
class Department {
    private String deptName;

    public Department(String deptName) {
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }

    public void displayDepartment() {
        System.out.println("Department: " + deptName);
    }
}

// Faculty class (Aggregation: Can exist independently of the University)
class Faculty {
    private String facultyName;

    public Faculty(String facultyName) {
        this.facultyName = facultyName;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void displayFaculty() {
        System.out.println("Faculty: " + facultyName);
    }
}

// University class (Composition with Departments, Aggregation with Faculties)
class University {
    private String universityName;
    private List<Department> departments;
    private List<Faculty> faculties;

    public University(String universityName) {
        this.universityName = universityName;
        this.departments = new ArrayList<>();
        this.faculties = new ArrayList<>();
    }

    // Add department (Composition: Part of University)
    public void addDepartment(String deptName) {
        departments.add(new Department(deptName));
    }

    // Add faculty (Aggregation: Can exist independently)
    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    // Display university details
    public void displayUniversity() {
        System.out.println("University: " + universityName);
        System.out.println("Departments:");
        for (Department dept : departments) {
            dept.displayDepartment();
        }
        System.out.println("Faculties:");
        for (Faculty faculty : faculties) {
            faculty.displayFaculty();
        }
    }

    // Deleting university also deletes departments (Composition effect)
    public void deleteUniversity() {
        System.out.println("Deleting university: " + universityName);
        departments.clear();  // Departments are deleted
        System.out.println("All departments have been deleted.");
    }
}

// Main class to demonstrate relationships
public class UniversitySystem {
    public static void main(String[] args) {
        // Create faculty members (Aggregation: Independent existence)
        Faculty faculty1 = new Faculty("Dr. Smith");
        Faculty faculty2 = new Faculty("Prof. Johnson");

        // Create a university
        University uni = new University("Tech University");

        // Add departments (Composition)
        uni.addDepartment("Computer Science");
        uni.addDepartment("Mechanical Engineering");

        // Add faculties (Aggregation)
        uni.addFaculty(faculty1);
        uni.addFaculty(faculty2);

        // Display university details
        uni.displayUniversity();

        // Deleting university should delete departments but not faculties
        uni.deleteUniversity();

        // Faculties still exist independently
        System.out.println("Faculty members are still available:");
        faculty1.displayFaculty();
        faculty2.displayFaculty();
    }
}
