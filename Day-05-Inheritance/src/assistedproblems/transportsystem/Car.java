package assistedproblems.transportsystem;

public class Car extends Vehicle {
    private String model;

    public Car(String model, double maxSpeed, String fuelType) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    @Override
    public void displayInfo(){
        System.out.println();
        super.displayInfo();
        System.out.println("model: "+model);
    }
}
