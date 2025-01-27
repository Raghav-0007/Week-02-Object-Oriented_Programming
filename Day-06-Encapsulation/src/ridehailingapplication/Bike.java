package ridehailingapplication;

public class Bike extends Vehicle implements GPS{
    private String currentLocation; // Current location of the bike

    // Constructor to initialize Bike details
    public Bike(String vehicleId, String driverName, double ratePerKm, String currentLocation) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = currentLocation;
    }

    // Implement calculateFare for Bike (based on rate per kilometer)
    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance;
    }

    // Implement getCurrentLocation from GPS interface
    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    // Implement updateLocation from GPS interface
    @Override
    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
    }
}
