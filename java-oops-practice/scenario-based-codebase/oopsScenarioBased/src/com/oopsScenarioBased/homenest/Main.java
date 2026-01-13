package com.oopsScenarioBased.homenest;

public class Main {
    public static void main(String[] args) {

        Device d1 = new Light("L101");
        Device d2 = new Camera("C202");
        Device d3 = new Thermostat("T303");
        Device d4 = new Lock("K404");

        d1.turnOn();
        d2.turnOn();

        System.out.println("Energy Used: " + d1.totalEnergy(3) + " units");

        d1.reset();
        d2.reset();
        d3.reset();
        d4.reset();
    }
}
