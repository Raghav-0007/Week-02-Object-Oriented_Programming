package assistedproblems.transportsystem;

public class Motorcycle extends Vehicle {
    private double price;

    public Motorcycle(double price, double maxSpeed, String fuelType) {
        this.price = price;
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    @Override
    public void displayInfo(){
        System.out.println();
        super.displayInfo();
        System.out.println("price: "+price);
    }
}
