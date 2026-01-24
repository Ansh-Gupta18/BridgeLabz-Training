package com.avltree;

import java.util.Map;
import java.util.TreeMap;

public class HospitalQueueSystem {

    // TreeMap: Check-in Time -> Patient
    private TreeMap<Long, Patient> patientQueue = new TreeMap<>();

    // Patient class
    static class Patient {
        int patientId;
        String name;
        String problem;

        Patient(int patientId, String name, String problem) {
            this.patientId = patientId;
            this.name = name;
            this.problem = problem;
        }

        @Override
        public String toString() {
            return "ID: " + patientId + ", Name: " + name + ", Issue: " + problem;
        }
    }

    // 🔹 Scenario 1: Patient Registration
    public void registerPatient(long checkInTime, int id, String name, String problem) {
        patientQueue.put(checkInTime, new Patient(id, name, problem));
        System.out.println("Patient registered: " + name);
    }

    // 🔹 Scenario 2: Discharge / Delete Record
    public void dischargePatient(long checkInTime) {
        if (patientQueue.remove(checkInTime) != null) {
            System.out.println("Patient discharged!");
        } else {
            System.out.println("Patient record not found!");
        }
    }

    // 🔹 Scenario 3: Display by Arrival Time
    public void displayPatientsByArrival() {
        System.out.println("\n🕒 Patients by Arrival Time:");
        for (Map.Entry<Long, Patient> entry : patientQueue.entrySet()) {
            System.out.println("Check-in: " + entry.getKey() + " -> " + entry.getValue());
        }
    }

    // Main Method
    public static void main(String[] args) {
        HospitalQueueSystem hospital = new HospitalQueueSystem();

        // Register Patients
        hospital.registerPatient(1001L, 1, "Ansh", "Fever");
        hospital.registerPatient(1003L, 2, "Rahul", "Fracture");
        hospital.registerPatient(1002L, 3, "Priya", "Headache");

        // Display by Arrival Time
        hospital.displayPatientsByArrival();

        // Discharge Patient
        hospital.dischargePatient(1002L);

        // Updated Queue
        hospital.displayPatientsByArrival();
    }
}

