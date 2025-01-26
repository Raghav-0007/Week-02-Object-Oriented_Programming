package employeemanagementsystem;

class FullTimeEmployee extends Employee {
    private int workHours;
    private String department;

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    @Override
    public void calculateSalary() {
        double totalSalary=baseSalary*workHours;
        System.out.println("FullTimeEmployee salary: "+totalSalary);
    }

    @Override
    public void assignDepartment(String department) {
        this.department=department;
    }

    @Override
    public void getDepartmentDetails() {
        System.out.println("Department: "+department);
    }
}
