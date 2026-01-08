package com.oopsScenarioBased.parkease;

class ParkingSlot {
    private String slotId;
    private boolean isOccupied;
    private String vehicleTypeAllowed;
    private String location;

    // Constructor for slot initialization
    public ParkingSlot(String slotId, String location, String vehicleTypeAllowed) {
        this.slotId = slotId;
        this.location = location;
        this.vehicleTypeAllowed = vehicleTypeAllowed;
        this.isOccupied = false;
    }

    public boolean isAvailable() {
        return !isOccupied;
    }

    // Slot availability cannot be altered externally
    public void assignSlot() {
        if (!isOccupied) {
            isOccupied = true;
        }
    }

    public void releaseSlot() {
        isOccupied = false;
    }

    public String getSlotInfo() {
        return "Slot: " + slotId + " | Location: " + location +
               " | Allowed: " + vehicleTypeAllowed +
               " | Available: " + !isOccupied;
    }
}

