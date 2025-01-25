package assistedproblems.employeemanagement;

public class Intern extends Employee {
    private String task;

    public Intern(String name, String id, int age, double salary, String task) {
        super(name, id, age, salary);
        this.task=task;
    }

    @Override
    public void displayDetails(){
        System.out.println();
        System.out.println("Displaying Intern details");
        super.displayDetails();
        System.out.println("task :"+task);
    }
}
