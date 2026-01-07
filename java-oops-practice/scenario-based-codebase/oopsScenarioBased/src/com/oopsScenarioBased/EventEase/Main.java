package com.oopsScenarioBased.EventEase;

public class Main {
    public static void main(String[] args) {

        User user1 = new User("Ansh Gupta", "ansh@gmail.com", "9876543210");

        Event birthday = new BirthdayEvent(
                "Ansh Birthday Bash", "Indore", "20-Feb-2026",
                50, user1, 15000);

        Event conference = new ConferenceEvent(
                "Tech Conference", "Bangalore", "10-Mar-2026",
                200, user1, 50000, 30000, 10000);

        Event[] events = { birthday, conference };

        for (Event e : events) {
            e.schedule();        // Polymorphism
            e.reschedule("25-Feb-2026");
            System.out.println("----------------------");
        }
    }
}
