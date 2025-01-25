// Superclass representing a general vehicle
class Vehicle {
    protected String model;  // Vehicle model
    protected int maxSpeed;  // Maximum speed of the vehicle

    // Constructor to initialize vehicle attributes
    public Vehicle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    // Method to display vehicle details
    public void displayInfo() {
        System.out.println("Model: " + model + ", Max Speed: " + maxSpeed + " km/h");
    }
}

// Interface defining refueling capability
interface Refuelable {
    // Abstract method to be implemented by refuelable vehicles
    void refuel();
}

// Subclass representing an electric vehicle
class ElectricVehicle extends Vehicle {
    private int batteryCapacity;  // Battery capacity in kWh

    // Constructor to initialize electric vehicle attributes
    public ElectricVehicle(String model, int maxSpeed, int batteryCapacity) {
        super(model, maxSpeed);
        this.batteryCapacity = batteryCapacity;
    }

    // Method to simulate charging the vehicle
    public void charge() {
        System.out.println(model + " is charging with capacity: " + batteryCapacity + " kWh.");
    }
}

// Subclass representing a petrol vehicle implementing Refuelable interface
class PetrolVehicle extends Vehicle implements Refuelable {
    private int fuelCapacity;  // Fuel tank capacity in liters

    // Constructor to initialize petrol vehicle attributes
    public PetrolVehicle(String model, int maxSpeed, int fuelCapacity) {
        super(model, maxSpeed);
        this.fuelCapacity = fuelCapacity;
    }

    // Implementing refuel() method from Refuelable interface
    @Override
    public void refuel() {
        System.out.println(model + " is refueling with " + fuelCapacity + " liters.");
    }
}

// Main class to test the vehicle management system
public class VehicleManagement {
    public static void main(String[] args) {
        // Creating an ElectricVehicle object
        ElectricVehicle ev = new ElectricVehicle("Tesla Model S", 250, 100);
        ev.displayInfo();
        ev.charge();

        // Creating a PetrolVehicle object
        PetrolVehicle pv = new PetrolVehicle("Toyota Corolla", 200, 50);
        pv.displayInfo();
        pv.refuel();
    }
}

