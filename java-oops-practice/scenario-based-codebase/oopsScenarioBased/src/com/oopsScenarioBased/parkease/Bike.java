package com.oopsScenarioBased.parkease;

public class Bike extends Vehicle {
    public Bike(String licensePlate) {
        super(licensePlate, 10); // base rate for Bike
    }

    @Override
    public double calculateCharges(int hoursParked) {
        double penalty = 0;
        if (hoursParked > 3) {
            penalty = 20;
        }
        return (baseRate * hoursParked) + penalty;
    }
}

