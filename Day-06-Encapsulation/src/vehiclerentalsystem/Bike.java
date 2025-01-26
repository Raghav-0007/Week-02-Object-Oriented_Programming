package vehiclerentalsystem;

public class Bike extends Vehicle {
    public Bike(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Bike", rentalRate);
    }

    // Rental cost calculation for bikes (fixed rate, no discount)
    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

}
