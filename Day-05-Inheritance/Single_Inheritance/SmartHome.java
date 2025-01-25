// Superclass representing a general smart home device
class Device {
    protected String deviceId;  
    protected String status;  

    // Constructor to initialize device attributes
    public Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    // Method to display the general status of the device
    public void displayStatus() {
        System.out.println("Device ID: " + deviceId + ", Status: " + status);
    }
}

// Subclass representing a thermostat device, inheriting from Device
class Thermostat extends Device {
    private double temperatureSetting;  

    // Constructor to initialize attributes 
    public Thermostat(String deviceId, String status, double temperatureSetting) {
        super(deviceId, status);  // Call superclass constructor
        this.temperatureSetting = temperatureSetting;
    }

    // Override the displayStatus method 
    @Override
    public void displayStatus() {
        super.displayStatus(); 
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }
}

// Main class to test the functionality of Device and Thermostat
public class SmartHome {
    public static void main(String[] args) {
        // Create a general device
        Device generalDevice = new Device("D001", "Online");
        
        // Create a thermostat device with specific temperature setting
        Thermostat thermostat = new Thermostat("T001", "Online", 22.5);

        // Display the status of both devices
        generalDevice.displayStatus();
        thermostat.displayStatus();
    }
}
