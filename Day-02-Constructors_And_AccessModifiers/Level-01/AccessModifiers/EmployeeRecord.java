// Base class: Employee
class Employee {
    public int employeeID;          // Public member
    protected String department;    // Protected member
    private double salary;          // Private member

    // Constructor to initialize employee details
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Public method to set the salary
    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
            System.out.println("Salary updated to: $" + salary);
        } else {
            System.out.println("Invalid salary amount.");
        }
    }

    // Public method to get the salary
    public double getSalary() {
        return salary;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: $" + salary);
    }
}

// Subclass: Manager
class Manager extends Employee {
    private String team;  // Additional attribute specific to Manager

    // Constructor to initialize manager details
    public Manager(int employeeID, String department, double salary, String team) {
        super(employeeID, department, salary); // Call parent constructor
        this.team = team;
    }

    // Method to display manager details
    @Override
    public void displayDetails() {
        super.displayDetails();  // Call parent method
        System.out.println("Team: " + team);
    }
}

// Main class to test the Employee and Manager classes
public class EmployeeRecord {
    public static void main(String[] args) {
        // Create an Employee object
        Employee emp = new Employee(101, "HR", 50000.0);
        emp.displayDetails();

        // Modify salary
        emp.setSalary(55000.0);
        System.out.println("Updated Salary: $" + emp.getSalary());

        System.out.println();

        // Create a Manager object
        Manager manager = new Manager(102, "IT", 75000.0, "Development Team");
        manager.displayDetails();

        // Modify salary for the manager
        manager.setSalary(80000.0);
        manager.displayDetails();
    }
}

