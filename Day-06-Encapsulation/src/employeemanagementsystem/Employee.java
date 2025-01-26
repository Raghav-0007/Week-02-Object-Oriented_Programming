package employeemanagementsystem;

abstract class Employee implements Department {
    private  String employeeId;
    protected  double baseSalary;
    private  String name;

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    abstract public void calculateSalary();

    public void displayDetails(){
        System.out.println("name: "+name);
        System.out.println("employeeId: "+employeeId);
        System.out.println("baseSalary: "+baseSalary);
    }
}
