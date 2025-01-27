package hospitalpatientmanagement;

import java.util.ArrayList;
import java.util.List;

public class InPatient extends Patient implements MedicalRecord{
    private double dailyRate;   // Daily hospitalization rate
    private int numberOfDays;   // Number of days the patient stayed
    private List<String> records;  // List to store medical records

    // Constructor to initialize in-patient details
    public InPatient(String patientId, String name, int age, double dailyRate, int numberOfDays) {
        super(patientId, name, age);
        this.dailyRate = dailyRate;
        this.numberOfDays = numberOfDays;
        this.records = new ArrayList<>();
    }

    // Implement calculateBill for in-patient (includes daily hospitalization rate)
    @Override
    public double calculateBill() {
        return dailyRate * numberOfDays;
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
