
// Create Vehicle class 
public class Vehicle {

    // Create Instance Variables:
    private String ownerName;
    private String vehicleType;

    // Create Class Variable:
    private static double registrationFee=500;

    // Create constructor of Vehicle class
    public Vehicle(String ownerName, String vehicleType){
        this.ownerName=ownerName;
        this.vehicleType=vehicleType;
    }

    // Create an instance method
    public void displayVehicleDetails(){
        System.out.println("ownerName: "+ this.ownerName);
        System.out.println("vehicleType: "+ this.vehicleType);
        System.out.println("registrationFee: "+ registrationFee);
        System.out.println();
    }

    // Create class method
    public static void updateRegistrationFee(double updateFee){
        registrationFee=updateFee;
        }
    public static void main(String[] args) {
        // Create vehicle class objects
        Vehicle v1=new Vehicle("Raghav", "Bike");
        v1.displayVehicleDetails();
        updateRegistrationFee(700);
        v1.displayVehicleDetails();
    }
}
