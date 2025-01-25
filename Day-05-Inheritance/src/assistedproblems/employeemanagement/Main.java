package assistedproblems.employeemanagement;

public class Main {
    public static void main(String[] args) {
        // Create object of Employee class
        Employee e=new Employee("Raghav", "124", 20, 30000);
        e.displayDetails();

        // Create object of Manager class
        Manager m=new Manager("Raghav2", "104", 21, 40000, 5, "managment system");
        m.displayDetails();

        // Create object of Intern class
        Intern i=new Intern("Raghav", "124", 20, 30000, "problems");
        i.displayDetails();
    }
}
