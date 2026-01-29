package com.travellog;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class TravelLogApp {

    private static final String FILE_NAME = "trips.dat";

    public static void main(String[] args) {

        // Step 1: Write trips to file
        writeTrips();

        // Step 2: Read trips from file
        List<Trip> trips = readTrips();

        // Step 3: Search cities using regex
        searchCitiesByRegex(trips, "Del|Par");

        // Step 4: Trips longer than 5 days
        printLongTrips(trips);

        // Step 5: Unique countries
        printUniqueCountries(trips);

        // Step 6: Top 3 visited cities
        printTopCities(trips);
    }

    // ------------------ Write ------------------
    private static void writeTrips() {
        List<Trip> trips = Arrays.asList(
            new Trip("Delhi", "India", 7, "Historic places"),
            new Trip("Paris", "France", 5, "Eiffel Tower"),
            new Trip("Delhi", "India", 3, "Street food"),
            new Trip("Rome", "Italy", 6, "Colosseum"),
            new Trip("Paris", "France", 8, "Museums")
        );

        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(trips);
            System.out.println("Trips saved successfully.\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // ------------------ Read ------------------
    private static List<Trip> readTrips() {
        try (ObjectInputStream ois =
                     new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            return (List<Trip>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }

    // ------------------ Regex Search ------------------
    private static void searchCitiesByRegex(List<Trip> trips, String regex) {
        System.out.println("Cities matching regex: " + regex);
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        for (Trip t : trips) {
            Matcher matcher = pattern.matcher(t.getCity());
            if (matcher.find()) {
                System.out.println(t);
            }
        }
        System.out.println();
    }

    // ------------------ Duration > 5 ------------------
    private static void printLongTrips(List<Trip> trips) {
        System.out.println("Trips longer than 5 days:");
        for (Trip t : trips) {
            if (t.getDurationDays() > 5) {
                System.out.println(t);
            }
        }
        System.out.println();
    }

    // ------------------ Unique Countries ------------------
    private static void printUniqueCountries(List<Trip> trips) {
        Set<String> countries = new HashSet<>();

        for (Trip t : trips) {
            countries.add(t.getCountry());
        }

        System.out.println("Unique countries visited:");
        System.out.println(countries);
        System.out.println();
    }

    // ------------------ Top 3 Cities ------------------
    private static void printTopCities(List<Trip> trips) {
        Map<String, Integer> cityCount = new HashMap<>();

        for (Trip t : trips) {
            cityCount.put(t.getCity(),
                cityCount.getOrDefault(t.getCity(), 0) + 1);
        }

        System.out.println("Top 3 most visited cities:");

        cityCount.entrySet().stream()
                .sorted((a, b) -> b.getValue() - a.getValue())
                .limit(3)
                .forEach(e ->
                    System.out.println(e.getKey() + " → " + e.getValue() + " visits")
                );
    }
}

