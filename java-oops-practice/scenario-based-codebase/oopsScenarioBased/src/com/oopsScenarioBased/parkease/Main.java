package com.oopsScenarioBased.parkease;

public class Main {
    public static void main(String[] args) {
        ParkingSlot slot1 = new ParkingSlot(1, "Car");
        ParkingSlot slot2 = new ParkingSlot(2, "Bike");
        ParkingSlot slot3 = new ParkingSlot(3, "Truck");

        Vehicle car1 = new Car("CAR123");
        Vehicle bike1 = new Bike("BIKE456");
        Vehicle truck1 = new Truck("TRUCK789");

        // Booking slots
        slot1.bookSlot(car1);
        slot2.bookSlot(bike1);
        slot3.bookSlot(truck1);

        // Releasing slots after some hours
        slot1.releaseSlot(6); // 6 hours
        slot2.releaseSlot(2); // 2 hours
        slot3.releaseSlot(5); // 5 hours
    }
}

