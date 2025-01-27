package hospitalpatientmanagement;

import java.util.ArrayList;
import java.util.List;

public class OutPatient extends Patient implements MedicalRecord{
    private double consultationFee;  // Consultation fee for outpatient
    private List<String> records;    // List to store medical records

    // Constructor to initialize out-patient details
    public OutPatient(String patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
        this.records = new ArrayList<>();
    }

    // Implement calculateBill for out-patient (only consultation fee)
    @Override
    public double calculateBill() {
        return consultationFee;
    }

    // Implement addRecord to store medical records
    @Override
    public void addRecord(String record) {
        records.add(record);
    }

    // Implement viewRecords to display all medical records
    @Override
    public void viewRecords() {
        System.out.println("Medical Records for " + getName() + ": ");
        for (String record : records) {
            System.out.println(record);
        }
    }

}
