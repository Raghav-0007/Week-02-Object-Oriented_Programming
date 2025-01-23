class Patient {
    // Static variable shared among all patients
    static String hospitalName = "City Hospital";
    private static int totalPatients = 0;

    // Instance variables
    private String name;
    private int age;
    private String ailment;
    private final int patientID;  // Final variable to uniquely identify each patient

    // Constructor using 'this' to initialize instance variables
    public Patient(String name, int age, String ailment) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = ++totalPatients;  // Unique ID generated automatically
    }

    // Static method to get the total number of patients admitted
    public static int getTotalPatients() {
        return totalPatients;
    }

    // Method to display patient details
    public void displayPatientDetails() {
        System.out.println("Hospital: " + hospitalName);
        System.out.println("Patient ID: " + patientID);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Ailment: " + ailment);
    }

    // Method to check if an object is an instance of Patient before displaying details
    public static void showDetailsIfPatient(Object obj) {
        if (obj instanceof Patient) {
            ((Patient) obj).displayPatientDetails();
        } else {
            System.out.println("Invalid object. Not a Patient instance.");
        }
    }

    public static void main(String[] args) {
        // Creating patient objects
        Patient p1 = new Patient("Alice", 30, "Fever");
        Patient p2 = new Patient("Bob", 45, "Diabetes");

        // Display patient details
        showDetailsIfPatient(p1);
        showDetailsIfPatient(p2);

        // Attempt to check a non-patient object
        String notAPatient = "Not a Patient";
        showDetailsIfPatient(notAPatient);

        // Display total number of patients admitted
        System.out.println("Total Patients Admitted: " + Patient.getTotalPatients());
    }
}
