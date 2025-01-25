package assistedproblems.employeemanagement;

public class Developer extends Employee {
    private String programmingLanguage;
    private String deadline;

    public Developer(String name, String id, int age, double salary, String programmingLanguage, String deadline) {
        super(name, id, age, salary);
        this.programmingLanguage=programmingLanguage;
        this.deadline=deadline;
    }

    @Override
    public void displayDetails(){
        System.out.println();
        System.out.println("Displaying Developer details");
        super.displayDetails();
        System.out.println("programmingLanguage :"+programmingLanguage);
        System.out.println("deadline :"+deadline);
    }
}
