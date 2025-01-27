package hospitalpatientmanagement;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a list of patients
        List<Patient> patients = new ArrayList<>();
        patients.add(new InPatient("IP001", "Alice", 30, 200, 5));
        patients.add(new OutPatient("OP001", "Bob", 45, 50));

        // Process each patient and calculate their bill dynamically
        for (Patient patient : patients) {
            System.out.println(patient.getPatientDetails());
            System.out.println("Bill Amount: $" + patient.calculateBill());

            // Handling medical records for each patient
            if (patient instanceof MedicalRecord) {
                MedicalRecord medicalRecordPatient = (MedicalRecord) patient;
                medicalRecordPatient.addRecord("Diagnosed with flu.");
                medicalRecordPatient.viewRecords();
            }

            System.out.println("----------------------------------");
        }
    }

}
