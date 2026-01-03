package com.oopsScenarioBased.hospitalpatient;

public class Main {

    public static void main(String[] args) {

        // Creating Doctor object
        Doctor doctor = new Doctor(101, "Dr. Sharma", "Cardiology");
        doctor.displayInfo();

        // Polymorphism : Patient reference
        Patient p1 = new OutPatient(1, "Ansh", 23, "5-01-2026");
        Patient p2 = new InPatient(2, "Abuzer", 30, 1);

        p1.displayInfo();
        p2.displayInfo();

        // Billing
        Payable bill = new Bill(500, 1200);
        System.out.println("Total Bill Amount: ₹" + bill.calculatePayment());
    }
}