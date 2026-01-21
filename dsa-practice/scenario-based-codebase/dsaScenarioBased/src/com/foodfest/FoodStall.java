package com.foodfest;

public class FoodStall {
    private String stallName;
    private int footfall;

    public FoodStall(String stallName, int footfall) {
        this.stallName = stallName;
        this.footfall = footfall;
    }

    public int getFootfall() {
        return footfall;
    }

    @Override
    public String toString() {
        return stallName + " -> Footfall: " + footfall;
    }
}

