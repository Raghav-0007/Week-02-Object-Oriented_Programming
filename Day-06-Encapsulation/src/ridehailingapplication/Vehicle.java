package ridehailingapplication;

public abstract class Vehicle {
    private String vehicleId;     // Vehicle ID
    private String driverName;    // Driver's name
    private double ratePerKm;     // Rate per kilometer

    // Constructor to initialize vehicle details
    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    // Getter methods for vehicle details (Encapsulation)
    public String getVehicleId() {
        return vehicleId;
    }

    public String getDriverName() {
        return driverName;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }

    // Method to get vehicle details
    public String getVehicleDetails() {
        return "Vehicle ID: " + vehicleId + ", Driver: " + driverName + ", Rate per Km: $" + ratePerKm;
    }

    // Abstract method to calculate fare (to be implemented by subclasses)
    public abstract double calculateFare(double distance);
}
