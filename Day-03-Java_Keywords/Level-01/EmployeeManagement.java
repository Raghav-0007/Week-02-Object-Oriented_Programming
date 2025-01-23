
import java.util.ArrayList;

// Create Employee class
class Employee {

    // Created attributes
    private static String companyName = "CG";
    private String name;
    private final String id;
    private String designation;
    private static ArrayList<Employee> employees = new ArrayList<>();

    // Create Employee class constructor
    public Employee(String name, String id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        employees.add(this);
    }

    // Create method to display Employee details
    public void displayEmployee() {
        System.out.println("companyName: " + companyName);
        System.out.println("name: " + this.name);
        System.out.println("id: " + this.id);
        System.out.println("designation: " + this.designation);
        System.out.println();
    }

    // Create method to display all Employee data
    public static void displayTotalEmployees() {
        for (Employee employee : employees) {
            employee.displayEmployee();
        }
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        // Create objects of Employee class
        Employee e1 = new Employee("Raghav", "124", "pune");
        Employee e2 = new Employee("abc", "654", "wt");
        Employee e3 = new Employee("xyz", "356", "etet");
        Employee e4 = new Employee("pqr", "574", "etege");

        System.out.println(e1 instanceof Employee);

        Employee.displayTotalEmployees();
    }
}
