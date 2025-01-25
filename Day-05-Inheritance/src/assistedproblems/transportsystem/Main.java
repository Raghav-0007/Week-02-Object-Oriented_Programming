package assistedproblems.transportsystem;

public class Main {
    public static void main(String[] args) {
        // Create object for Car class
        Car car=new Car("creta", 250, "Diesel");

        // Create object for Truck object
        Truck truck=new Truck(2500, 150, "Diesel");

        // Create object for Motorcycle class
        Motorcycle motorcycle=new Motorcycle(120000, 200, "petrol");

        // calling method
        car.displayInfo();
        truck.displayInfo();
        motorcycle.displayInfo();
    }
}
