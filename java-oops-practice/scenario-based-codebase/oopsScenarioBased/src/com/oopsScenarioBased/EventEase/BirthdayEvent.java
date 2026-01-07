package com.oopsScenarioBased.EventEase;

class BirthdayEvent extends Event {

    public BirthdayEvent(String eventName, String location, String date,
                         int attendees, User organizer, double venueCost) {
        super(eventName, location, date, attendees, organizer, venueCost);
    }

    @Override
    public void schedule() {
        System.out.println("Birthday Party Scheduled!");
        showEventDetails();
    }
}
