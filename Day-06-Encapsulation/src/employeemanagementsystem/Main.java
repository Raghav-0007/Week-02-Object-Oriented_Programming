package employeemanagementsystem;

public class Main {
    public static void main(String[] args) {
        Employee e1=new FullTimeEmployee();
        Employee e2=new PartTimeEmployee();

        e1.setName("Raghav");
        e1.setBaseSalary(500);
        e1.setEmployeeId("00524");
        e1.assignDepartment("it");

        e2.setName("Radhe");
        e2.setBaseSalary(400);
        e2.setEmployeeId("00534");
        e2.assignDepartment("cs");

        e1.displayDetails();
        e1.getDepartmentDetails();

        System.out.println();

        e2.displayDetails();
        e2.getDepartmentDetails();

        e1.calculateSalary();
        e2.calculateSalary();

    }
}
