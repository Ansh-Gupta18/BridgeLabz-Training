package com.oopsScenarioBased.homenest;

class Device implements IControllable {

    protected String deviceId;
    private boolean status;          // Encapsulation
    protected double energyUsage;
    private String firmwareLog;       // secured log

    Device(String deviceId, double energyUsage) {
        this.deviceId = deviceId;
        this.energyUsage = energyUsage;
        this.status = false;
        this.firmwareLog = "Updated";
        System.out.println("Device Registered: " + deviceId);
    }

    public boolean getStatus() {
        return status;
    }

    protected void updateStatus(boolean state) {
        status = state;
    }

    public double totalEnergy(double hours) {
        return energyUsage * hours;   // operator usage
    }

    @Override
    public void turnOn() {
        updateStatus(true);
        System.out.println(deviceId + " turned ON");
    }

    @Override
    public void turnOff() {
        updateStatus(false);
        System.out.println(deviceId + " turned OFF");
    }

    @Override
    public void reset() {
        System.out.println("Device reset");
    }
}
