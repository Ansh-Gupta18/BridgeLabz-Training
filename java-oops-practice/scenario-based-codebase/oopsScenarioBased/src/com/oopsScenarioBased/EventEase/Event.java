package com.oopsScenarioBased.EventEase;

abstract class Event implements ISchedulable {

    private static int counter = 1000;

    // Final ensures eventId cannot be modified
    private final int eventId;

    protected String eventName;
    protected String location;
    protected String date;
    protected int attendees;
    protected User organizer;

    // Encapsulated pricing fields
    private double venueCost;
    private double serviceCost;
    private double discount;

    // Constructor without services
    public Event(String eventName, String location, String date,
                 int attendees, User organizer, double venueCost) {
        this.eventId = ++counter;
        this.eventName = eventName;
        this.location = location;
        this.date = date;
        this.attendees = attendees;
        this.organizer = organizer;
        this.venueCost = venueCost;
    }

    // Constructor with catering & decoration
    public Event(String eventName, String location, String date,
                 int attendees, User organizer,
                 double venueCost, double serviceCost, double discount) {
        this(eventName, location, date, attendees, organizer, venueCost);
        this.serviceCost = serviceCost;
        this.discount = discount;
    }

    // Operator usage for total cost
    public double calculateTotalCost() {
        return venueCost + serviceCost - discount;
    }

    // Protected display
    protected void showEventDetails() {
        System.out.println("Event ID: " + eventId);
        System.out.println("Event: " + eventName);
        System.out.println("Organizer: " + organizer.getName());
        System.out.println("Total Cost: ₹" + calculateTotalCost());
    }

    // Polymorphic method
    public abstract void schedule();

    public void reschedule(String newDate) {
        this.date = newDate;
        System.out.println(eventName + " rescheduled to " + newDate);
    }

    public void cancel() {
        System.out.println(eventName + " has been cancelled ❌");
    }
}

