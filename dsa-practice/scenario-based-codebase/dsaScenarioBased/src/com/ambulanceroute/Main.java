package com.ambulanceroute;

public class Main {
    public static void main(String[] args) {

        AmbulanceRoute route = new AmbulanceRoute();

        route.addUnit("Emergency", false);
        route.addUnit("Radiology", false);
        route.addUnit("Surgery", true);
        route.addUnit("ICU", true);

        System.out.println(" Hospital Route:");
        route.displayUnits();

        System.out.println("\n Incoming Patient:");
        route.redirectPatient();

        System.out.println("\n Surgery under maintenance:");
        route.removeUnit("Surgery");

        System.out.println("\n Incoming Patient Again:");
        route.redirectPatient();
    }
}
