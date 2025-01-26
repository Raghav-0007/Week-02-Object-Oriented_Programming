package vehiclerentalsystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Creating a list of vehicles
        List<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(new Car("C123", 50, "CAR98765"));
        vehicleList.add(new Bike("B456", 20));
        vehicleList.add(new Truck("T789", 100, "TRK54321"));

        // Iterating over the list and calculating rental and insurance costs
        for (Vehicle vehicle : vehicleList) {
            int rentalDays = 10;  // Example rental period

            // Calculate rental cost
            double rentalCost = vehicle.calculateRentalCost(rentalDays);

            // Display vehicle details and rental cost
            System.out.println("Vehicle: " + vehicle.getType() + " (" + vehicle.getVehicleNumber() + ")");
            System.out.println("Rental Cost for " + rentalDays + " days: $" + rentalCost);

            // Check if the vehicle is insurable and calculate insurance
            if (vehicle instanceof Insurable) {
                Insurable insurableVehicle = (Insurable) vehicle;
                double insuranceCost = insurableVehicle.calculateInsurance();
                System.out.println("Insurance Cost: $" + insuranceCost);
                System.out.println(insurableVehicle.getInsuranceDetails());
            }

            System.out.println("----------------------------------");
        }
    }

}
