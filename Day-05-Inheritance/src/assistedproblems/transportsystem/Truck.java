package assistedproblems.transportsystem;

public class Truck extends Vehicle {
    private double loadCapacity;

    public Truck(double loadCapacity, double maxSpeed, String fuelType) {
        this.loadCapacity = loadCapacity;
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    @Override
    public void displayInfo(){
        System.out.println();
        super.displayInfo();
        System.out.println("loadCapacity: "+loadCapacity);
    }
}
