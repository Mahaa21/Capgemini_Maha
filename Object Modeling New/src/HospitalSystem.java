import java.util.*;

class Patient {
    private String name;

    public Patient(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Doctor {
    private String name;
    private List<Patient> patients;

    public Doctor(String name) {
        this.name = name;
        this.patients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void consult(Patient patient) {
        if (!patients.contains(patient)) {
            patients.add(patient);
        }
        System.out.println("Dr. " + name + " is consulting patient " + patient.getName());
    }

    public void showPatients() {
        System.out.println("Dr. " + name + "'s patients:");
        for (Patient p : patients) {
            System.out.println(" - " + p.getName());
        }
    }
}

class Hospital {
    private String name;
    private List<Doctor> doctors;
    private List<Patient> patients;

    public Hospital(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    public void addDoctor(Doctor d) {
        doctors.add(d);
    }

    public void addPatient(Patient p) {
        patients.add(p);
    }

    public void showDoctors() {
        System.out.println("Doctors at " + name + ":");
        for (Doctor d : doctors) {
            System.out.println(" - " + d.getName());
        }
    }

    public void showPatients() {
        System.out.println("Patients at " + name + ":");
        for (Patient p : patients) {
            System.out.println(" - " + p.getName());
        }
    }
}

public class HospitalSystem {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("City Hospital");

        Doctor d1 = new Doctor("John");
        Doctor d2 = new Doctor("Emma");

        Patient p1 = new Patient("Alice");
        Patient p2 = new Patient("Bob");
        Patient p3 = new Patient("Charlie");

        hospital.addDoctor(d1);
        hospital.addDoctor(d2);

        hospital.addPatient(p1);
        hospital.addPatient(p2);
        hospital.addPatient(p3);

        d1.consult(p1);
        d1.consult(p2);

        d2.consult(p2);
        d2.consult(p3);

        System.out.println();
        hospital.showDoctors();
        hospital.showPatients();

        System.out.println();
        d1.showPatients();
        d2.showPatients();
    }
}
