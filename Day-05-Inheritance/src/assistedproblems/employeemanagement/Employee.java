package assistedproblems.employeemanagement;

public class Employee {
    protected String name;
    protected int age;
    protected String id;
    protected double salary;

    public Employee(String name, String id, int age, double salary) {
        this.name = name;
        this.id = id;
        this.age=age;
        this.salary = salary;
    }

    public void displayDetails(){
        System.out.println("name: "+name);
        System.out.println("id: "+id);
        System.out.println("age: "+age);
        System.out.println("salary: "+salary);
    }
}
