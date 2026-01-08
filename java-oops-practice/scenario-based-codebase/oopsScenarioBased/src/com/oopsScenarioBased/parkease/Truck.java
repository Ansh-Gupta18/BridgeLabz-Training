package com.oopsScenarioBased.parkease;

public class Truck extends Vehicle {
    public Truck(String licensePlate) {
        super(licensePlate, 50); // base rate for Truck
    }

    @Override
    public double calculateCharges(int hoursParked) {
        double penalty = 0;
        if (hoursParked > 4) {
            penalty = 100;
        }
        return (baseRate * hoursParked) + penalty;
    }
}

