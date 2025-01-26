package vehiclerentalsystem;

public abstract class Vehicle {
    private String vehicleNumber;  // Unique vehicle number
    private String type;           // Type of vehicle (Car, Bike, Truck)
    private double rentalRate;      // Rental rate per day

    // Constructor to initialize vehicle details
    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    // Getter methods to access vehicle details
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    // Setter methods (Encapsulation: protects data)
    public void setRentalRate(double rentalRate) {
        if (rentalRate > 0) {
            this.rentalRate = rentalRate;
        }
    }

    // Abstract method to calculate rental cost based on the number of days
    public abstract double calculateRentalCost(int days);

}
