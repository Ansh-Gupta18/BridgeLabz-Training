package com.foodfest;

import java.util.ArrayList;
import java.util.List;

public class FoodFestApp {

    public static void main(String[] args) {

        // Zone A (already sorted)
        List<FoodStall> zoneA = new ArrayList<>();
        zoneA.add(new FoodStall("Burger Hub", 120));
        zoneA.add(new FoodStall("Pizza Point", 200));

        // Zone B (already sorted)
        List<FoodStall> zoneB = new ArrayList<>();
        zoneB.add(new FoodStall("Taco Town", 120));
        zoneB.add(new FoodStall("Pasta Palace", 250));

        // Combine zone-wise data
        List<FoodStall> allStalls = new ArrayList<>();
        allStalls.addAll(zoneA);
        allStalls.addAll(zoneB);

        // Apply Merge Sort
        List<FoodStall> sortedStalls = MergeSorter.mergeSort(allStalls);

        System.out.println(" FoodFest – Sorted Stalls by Footfall:");
        for (FoodStall stall : sortedStalls) {
            System.out.println(stall);
        }
    }
}

