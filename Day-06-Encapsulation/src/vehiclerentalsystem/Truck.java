package vehiclerentalsystem;

public class Truck extends Vehicle implements Insurable{
    private String insurancePolicyNumber;  // Encapsulated insurance details

    // Constructor to initialize truck details
    public Truck(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Truck", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    // Implement rental cost calculation with additional 20% charge for heavy loads
    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days * 1.20;  // Trucks have an extra charge
    }

    // Calculate truck insurance (8% of total rental cost)
    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.08;
    }

    // Provide insurance details (hiding sensitive information)
    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance: Policy No. " + insurancePolicyNumber.substring(0, 3) + "****";
    }

}
