package vehiclerentalsystem;

public class Car extends Vehicle implements Insurable{
    private String insurancePolicyNumber;

    // Constructor to initialize car details
    public Car(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Car", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    // Implement rental cost calculation with 10% discount for rentals over 7 days
    @Override
    public double calculateRentalCost(int days) {
        double cost = getRentalRate() * days;
        if (days > 7) {
            cost *= 0.90;  // 10% discount for long-term rentals
        }
        return cost;
    }

    // Calculate car insurance (5% of total rental cost)
    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.05;
    }

    // Provide insurance details (hiding sensitive information)
    @Override
    public String getInsuranceDetails() {
        return "Car Insurance: Policy No. " + insurancePolicyNumber.substring(0, 3) + "****";
    }

}
