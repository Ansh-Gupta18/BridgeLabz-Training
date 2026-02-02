package com.functionalinterface.multivehiclerentalsystem;

class Bike implements Vehicle {

    @Override
    public void rent() {
        System.out.println("Bike rented at ₹500 per day");
    }

    @Override
    public void returnVehicle() {
        System.out.println("Bike returned successfully");
    }
}
