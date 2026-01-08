package com.oopsScenarioBased.parkease;

public class ParkingSlot {
    private int slotId;
    private boolean isOccupied;
    private String vehicleTypeAllowed;
    private Vehicle currentVehicle;

    public ParkingSlot(int slotId, String vehicleTypeAllowed) {
        this.slotId = slotId;
        this.vehicleTypeAllowed = vehicleTypeAllowed;
        this.isOccupied = false;
        this.currentVehicle = null;
    }

    public boolean bookSlot(Vehicle vehicle) {
        if (!isOccupied && vehicle.getClass().getSimpleName().equalsIgnoreCase(vehicleTypeAllowed)) {
            this.currentVehicle = vehicle;
            this.isOccupied = true;
            System.out.println("Slot " + slotId + " booked for " + vehicle.getLicensePlate());
            return true;
        } else {
            System.out.println("Slot " + slotId + " not available for " + vehicle.getLicensePlate());
            return false;
        }
    }

    public double releaseSlot(int hoursParked) {
        if (isOccupied && currentVehicle != null) {
            double charges = currentVehicle.calculateCharges(hoursParked);
            System.out.println("Vehicle " + currentVehicle.getLicensePlate() +
                               " leaving slot " + slotId + ". Charges: " + charges);
            currentVehicle = null;
            isOccupied = false;
            return charges;
        }
        return 0;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public String getVehicleTypeAllowed() {
        return vehicleTypeAllowed;
    }
}


