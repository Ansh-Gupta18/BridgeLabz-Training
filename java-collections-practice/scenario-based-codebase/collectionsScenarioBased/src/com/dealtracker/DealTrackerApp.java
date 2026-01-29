package com.dealtracker;

import java.util.*;
import java.util.stream.*;

// Main application
public class DealTrackerApp {

    public static void main(String[] args) {

        // Read deals from file
        Map<String, Deal> deals =
                DealParser.readDeals("deals.txt");

        System.out.println("Valid Deals Found: " + deals.size());

        // Sort deals by discount (descending)
        List<Deal> sortedDeals =
                deals.values().stream()
                        .sorted(Comparator.comparingInt(
                                Deal::getDiscountPercent).reversed())
                        .collect(Collectors.toList());

        System.out.println("\n--- Active Deals ---");
        sortedDeals.forEach(System.out::println);
    }
}
