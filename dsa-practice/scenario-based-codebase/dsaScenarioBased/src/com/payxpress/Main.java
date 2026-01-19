package com.oopsScenarioBased.payxpress;

public class Main {
    public static void main(String[] args) {

        Bill b1 = new ElectricityBill(1200, "10-Feb");
        Bill b2 = new InternetBill(800, "08-Feb");
        Bill b3 = new WaterBill(300, "12-Feb");

        b1.sendReminder();
        b2.sendReminder();
        b3.sendReminder();

        b1.pay();

        System.out.println("Late fee amount: " + b2.lateFee(100));
    }
}

