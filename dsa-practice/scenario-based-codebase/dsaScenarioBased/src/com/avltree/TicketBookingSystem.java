package com.avltree;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.TreeMap;

public class TicketBookingSystem {

    // TreeMap: Event Time -> Event Details (Sorted by time)
    private TreeMap<LocalDateTime, Event> events = new TreeMap<>();

    // Event class
    static class Event {
        String name;
        String location;

        Event(String name, String location) {
            this.name = name;
            this.location = location;
        }

        @Override
        public String toString() {
            return name + " at " + location;
        }
    }

    // 🔹 Scenario 1: Insert Event
    public void addEvent(LocalDateTime time, String name, String location) {
        events.put(time, new Event(name, location));
        System.out.println("Event added: " + name);
    }

    // 🔹 Scenario 2: Cancel Event
    public void cancelEvent(LocalDateTime time) {
        if (events.remove(time) != null) {
            System.out.println("Event cancelled!");
        } else {
            System.out.println("Event not found!");
        }
    }

    // 🔹 Scenario 3: Show Events in Upcoming Order
    public void showUpcomingEvents() {
        System.out.println("\n Upcoming Events:");
        for (Map.Entry<LocalDateTime, Event> entry : events.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    // Main Method
    public static void main(String[] args) {
        TicketBookingSystem system = new TicketBookingSystem();

        // Insert Events
        system.addEvent(LocalDateTime.of(2026, 2, 10, 18, 0),
                "Rock Concert", "Mumbai");
        system.addEvent(LocalDateTime.of(2026, 1, 25, 10, 30),
                "Tech Conference", "Bangalore");
        system.addEvent(LocalDateTime.of(2026, 3, 5, 20, 0),
                "Stand-up Comedy", "Delhi");

        // Display Events in Order
        system.showUpcomingEvents();

        // Cancel Event
        system.cancelEvent(LocalDateTime.of(2026, 1, 25, 10, 30));

        // Updated List
        system.showUpcomingEvents();
    }
}

