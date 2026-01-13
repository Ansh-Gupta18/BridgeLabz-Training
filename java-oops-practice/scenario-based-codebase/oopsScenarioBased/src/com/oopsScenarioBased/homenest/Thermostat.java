package com.oopsScenarioBased.homenest;

class Thermostat extends Device {

    Thermostat(String id) {
        super(id, 8);
    }

    @Override
    public void reset() {
        System.out.println("Temperature reset to default");
    }
}
