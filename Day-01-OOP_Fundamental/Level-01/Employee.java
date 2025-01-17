// Program to Display Employee Details

class Employee {
    // Attributes of the Employee class
    String name;
    int id;
    double salary;

    // Constructor to initialize the Employee object
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display the employee details
    public void displayDetails() {
        System.out.println("Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: $" + salary);
    }

    public static void main(String[] args) {
        // Create an Employee object and initialize it with values
        Employee employee1 = new Employee("John Doe", 101, 55000);

        // Display the details of the employee
        employee1.displayDetails();
    }
}
