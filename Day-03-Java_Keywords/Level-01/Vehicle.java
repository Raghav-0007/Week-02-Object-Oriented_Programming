class Vehicle {
    // Static variable shared across all vehicles
    static double registrationFee = 5000.0;  // Default registration fee

    // Instance variables
    private String ownerName;
    private String vehicleType;
    private final String registrationNumber;  // Final variable (cannot be changed)

    // Constructor using 'this' to initialize values
    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    // Static method to update registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Registration fee updated to: " + registrationFee);
    }

    // Method to display vehicle details
    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Registration Fee: $" + registrationFee);
    }

    // Method to check if an object is an instance of Vehicle before displaying details
    public static void showDetailsIfVehicle(Object obj) {
        if (obj instanceof Vehicle) {
            ((Vehicle) obj).displayVehicleDetails();
        } else {
            System.out.println("Invalid object. Not a Vehicle instance.");
        }
    }

    public static void main(String[] args) {
        // Creating vehicle objects
        Vehicle car = new Vehicle("Alice", "Car", "ABC123");
        Vehicle bike = new Vehicle("Bob", "Bike", "XYZ789");

        // Display vehicle details
        showDetailsIfVehicle(car);
        showDetailsIfVehicle(bike);

        // Attempt to check a non-vehicle object
        String notAVehicle = "Just a String";
        showDetailsIfVehicle(notAVehicle);

        // Update registration fee for all vehicles
        Vehicle.updateRegistrationFee(6000.0);

        // Display updated details
        showDetailsIfVehicle(car);
    }
}

