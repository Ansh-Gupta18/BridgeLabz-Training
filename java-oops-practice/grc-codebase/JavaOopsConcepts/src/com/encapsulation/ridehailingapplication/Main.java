package com.encapsulation.ridehailingapplication;

import java.util.ArrayList;
import java.util.List;

// Main application class
public class Main {

    public static void main(String[] args) {

        // Creating list of vehicles (Polymorphism)
        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car("CAR1011", "Ansh"));
        vehicles.add(new Bike("BIKE2022", "Rahul"));
        vehicles.add(new Auto("AUTO3033", "Suresh"));

        // Calculate fare for a 10 km ride
        RideService.calculateRideFare(vehicles, 10);
    }
}
