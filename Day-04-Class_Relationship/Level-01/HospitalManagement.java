import java.util.ArrayList;
import java.util.List;

// Patient class
class Patient {
    private String patientName;

    public Patient(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientName() {
        return patientName;
    }
}

// Doctor class
class Doctor {
    private String doctorName;
    private List<Patient> patients;

    public Doctor(String doctorName) {
        this.doctorName = doctorName;
        this.patients = new ArrayList<>();
    }

    // Method to consult a patient
    public void consult(Patient patient) {
        if (!patients.contains(patient)) {
            patients.add(patient);
        }
        System.out.println("Dr. " + doctorName + " is consulting patient " + patient.getPatientName());
    }

    // Display patients of the doctor
    public void showPatients() {
        System.out.println("Dr. " + doctorName + " has the following patients:");
        for (Patient p : patients) {
            System.out.println("- " + p.getPatientName());
        }
    }

    public String getDoctorName() {
        return doctorName;
    }
}

// Hospital class
class Hospital {
    private String hospitalName;
    private List<Doctor> doctors;
    private List<Patient> patients;

    public Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    // Add a doctor to the hospital
    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    // Add a patient to the hospital
    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    // Display all doctors in the hospital
    public void showDoctors() {
        System.out.println("Doctors at " + hospitalName + ":");
        for (Doctor doc : doctors) {
            System.out.println("- " + doc.getDoctorName());
        }
    }

    // Display all patients in the hospital
    public void showPatients() {
        System.out.println("Patients at " + hospitalName + ":");
        for (Patient pat : patients) {
            System.out.println("- " + pat.getPatientName());
        }
    }
}

// Main class to demonstrate relationships
public class HospitalManagement {
    public static void main(String[] args) {
        // Create hospital
        Hospital hospital = new Hospital("City Hospital");

        // Create doctors
        Doctor doc1 = new Doctor("John Doe");
        Doctor doc2 = new Doctor("Jane Smith");

        // Create patients
        Patient pat1 = new Patient("Alice");
        Patient pat2 = new Patient("Bob");

        // Add doctors and patients to hospital
        hospital.addDoctor(doc1);
        hospital.addDoctor(doc2);
        hospital.addPatient(pat1);
        hospital.addPatient(pat2);

        // Display hospital data
        hospital.showDoctors();
        hospital.showPatients();

        // Doctor-patient consultations (many-to-many association)
        doc1.consult(pat1);
        doc1.consult(pat2);
        doc2.consult(pat1);

        // Show patients for each doctor
        doc1.showPatients();
        doc2.showPatients();
    }
}

