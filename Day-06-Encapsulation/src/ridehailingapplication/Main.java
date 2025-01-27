package ridehailingapplication;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a list of vehicles
        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car("C001", "John", 10.0, "Location A"));
        vehicles.add(new Bike("B001", "Jane", 5.0, "Location B"));
        vehicles.add(new Auto("A001", "Mike", 7.0, "Location C"));

        // Process each vehicle and calculate the fare dynamically
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getVehicleDetails());

            // Calculate and print the fare for a distance of 10 km
            double fare = vehicle.calculateFare(10);
            System.out.println("Fare for 10 km: $" + fare);

            // Handling GPS functionality
            if (vehicle instanceof GPS) {
                GPS gpsVehicle = (GPS) vehicle;
                System.out.println("Current Location: " + gpsVehicle.getCurrentLocation());

                // Update location
                gpsVehicle.updateLocation("New Location");
                System.out.println("Updated Location: " + gpsVehicle.getCurrentLocation());
            }

            System.out.println("----------------------------------");
        }
    }
}
