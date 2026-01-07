package com.oopsScenarioBased.EventEase;

class ConferenceEvent extends Event {

    public ConferenceEvent(String eventName, String location, String date,
                            int attendees, User organizer,
                            double venueCost, double serviceCost, double discount) {
        super(eventName, location, date, attendees, organizer,
              venueCost, serviceCost, discount);
    }

    @Override
    public void schedule() {
        System.out.println("Conference Scheduled with corporate setup");
        showEventDetails();
    }
}
