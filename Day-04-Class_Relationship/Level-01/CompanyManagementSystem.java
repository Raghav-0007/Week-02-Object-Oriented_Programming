import java.util.ArrayList;
import java.util.List;

// Employee class (exists only within a Department)
class Employee {
    private String employeeName;
    private int employeeID;
    
    // Constructor to initialize Employee details
    public Employee(String employeeName, int employeeID) {
        this.employeeName = employeeName;
        this.employeeID = employeeID;
    }

    // Display employee details
    public void displayEmployee() {
        System.out.println("Employee ID: " + employeeID + ", Name: " + employeeName);
    }
}

// Department class (exists only within a Company)
class Department {
    private String departmentName;
    private List<Employee> employees;

    // Constructor to initialize Department with employees
    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.employees = new ArrayList<>();
    }

    // Add an employee to the department
    public void addEmployee(String name, int id) {
        employees.add(new Employee(name, id));
    }

    // Display department details
    public void displayDepartment() {
        System.out.println("Department: " + departmentName);
        for (Employee emp : employees) {
            emp.displayEmployee();
        }
    }

    // Add a getter method in the Department class
public String getDepartmentName() {
    return departmentName;
}

}

// Company class (owns departments and employees)
class Company {
    private String companyName;
    private List<Department> departments;

    // Constructor to initialize Company
    public Company(String companyName) {
        this.companyName = companyName;
        this.departments = new ArrayList<>();
    }

    // Add a department to the company
    public void addDepartment(String departmentName) {
        departments.add(new Department(departmentName));
    }

    // Add employee to a specific department
    public void addEmployeeToDepartment(String deptName, String empName, int empID) {
        for (Department dept : departments) {
            if (dept.getDepartmentName().equals(deptName)) {  // Corrected access
                dept.addEmployee(empName, empID);
            }
        }
    }    

    // Display company details
    public void displayCompany() {
        System.out.println("Company: " + companyName);
        for (Department dept : departments) {
            dept.displayDepartment();
        }
    }
}

// Main class to run the program
public class CompanyManagementSystem {
    public static void main(String[] args) {
        // Create a Company object
        Company myCompany = new Company("TechCorp");

        // Add departments
        myCompany.addDepartment("HR");
        myCompany.addDepartment("IT");

        // Add employees to departments
        myCompany.addEmployeeToDepartment("HR", "Alice Johnson", 101);
        myCompany.addEmployeeToDepartment("IT", "Bob Smith", 102);

        // Display company structure
        myCompany.displayCompany();
    }
}

