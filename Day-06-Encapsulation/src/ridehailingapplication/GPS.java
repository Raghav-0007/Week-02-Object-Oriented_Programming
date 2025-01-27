package ridehailingapplication;

public interface GPS {
    String getCurrentLocation(); // Get current location of the vehicle
    void updateLocation(String newLocation); // Update the vehicle's location
}
