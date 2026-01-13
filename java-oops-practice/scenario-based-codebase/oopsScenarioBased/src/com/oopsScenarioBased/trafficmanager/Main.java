package com.oopsScenarioBased.trafficmanager;

class Main {
    public static void main(String[] args) {

        Roundabout roundabout = new Roundabout();
        EntryQueue queue = new EntryQueue();

        queue.enqueue("Car1");
        queue.enqueue("Car2");
        queue.enqueue("Car3");

        roundabout.addVehicle(queue.dequeue());
        roundabout.addVehicle(queue.dequeue());

        roundabout.display();

        roundabout.removeVehicle("Car1");
        roundabout.display();

        roundabout.addVehicle(queue.dequeue());
        roundabout.display();
    }
}
