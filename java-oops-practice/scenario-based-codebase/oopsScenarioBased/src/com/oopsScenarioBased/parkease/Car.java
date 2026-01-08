package com.oopsScenarioBased.parkease;

public class Car extends Vehicle {
    public Car(String licensePlate) {
        super(licensePlate, 20); // base rate for Car
    }

    @Override
    public double calculateCharges(int hoursParked) {
        double penalty = 0;
        if (hoursParked > 5) {
            penalty = 50;
        }
        return (baseRate * hoursParked) + penalty;
    }
}

