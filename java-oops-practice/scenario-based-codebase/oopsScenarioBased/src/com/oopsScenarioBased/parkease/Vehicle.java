package com.oopsScenarioBased.parkease;

public abstract class Vehicle implements IPayable {
    protected String licensePlate;
    protected int baseRate; // base rate per hour

    public Vehicle(String licensePlate, int baseRate) {
        this.licensePlate = licensePlate;
        this.baseRate = baseRate;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public abstract double calculateCharges(int hoursParked);
}

