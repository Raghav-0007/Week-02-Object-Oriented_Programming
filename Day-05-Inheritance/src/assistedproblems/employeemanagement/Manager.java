package assistedproblems.employeemanagement;

public class Manager extends Employee {
    private int teamSize;
    private String projectName;

    public Manager(String name, String id, int age, double salary, int teamSize, String projectName) {
        super(name, id, age, salary);
        this.teamSize=teamSize;
        this.projectName=projectName;
    }

    @Override
    public void displayDetails(){
        System.out.println();
        System.out.println("Displaying manager details");
        super.displayDetails();
        System.out.println("teamSize :"+teamSize);
        System.out.println("projectName :"+projectName);
    }
}
