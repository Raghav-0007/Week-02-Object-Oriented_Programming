package assistedproblems.transportsystem;

public class Vehicle {
    protected double maxSpeed;
    protected String fuelType;

    public void displayInfo(){
        System.out.println("maxSpeed: "+maxSpeed);
        System.out.println("fuelType: "+fuelType);
    }
}
