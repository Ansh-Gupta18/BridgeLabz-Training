package com.oopsScenarioBased.parkease;

public class Main {
    public static void main(String[] args) {

        ParkingSlot slot1 = new ParkingSlot("P101", "Zone-A", "Car");
        Vehicle car = new Car("MP09-1234");

        ParkingManager manager = new ParkingManager();

        manager.bookSlot(slot1, car, 6);
        manager.showLogs();

        slot1.releaseSlot();
        System.out.println(slot1.getSlotInfo());
    }
}

