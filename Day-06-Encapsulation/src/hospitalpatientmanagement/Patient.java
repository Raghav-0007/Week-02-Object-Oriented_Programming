package hospitalpatientmanagement;

public abstract class Patient {
    private String patientId;  // Unique patient ID
    private String name;       // Name of the patient
    private int age;           // Age of the patient

    // Constructor to initialize patient details
    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    // Getter methods for patient details (Encapsulation)
    public String getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Method to get patient details (Concrete method)
    public String getPatientDetails() {
        return "Patient ID: " + patientId + ", Name: " + name + ", Age: " + age;
    }

    // Abstract method to calculate the patient's bill (to be implemented by subclasses)
    public abstract double calculateBill();
}
