package com.fleetmanager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vehicles: ");
        int n = sc.nextInt();

        Vehicle[] vehicles = new Vehicle[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Vehicle ID: ");
            String id = sc.next();

            System.out.print("Enter Mileage: ");
            int mileage = sc.nextInt();

            vehicles[i] = new Vehicle(id, mileage);
        }

        FleetManager.mergeSort(vehicles, 0, n - 1);

        System.out.println("\nMaster Maintenance Schedule:");
        for (Vehicle v : vehicles) {
            System.out.println(v.vehicleId + " - " + v.mileage);
        }

        sc.close();
    }
}

