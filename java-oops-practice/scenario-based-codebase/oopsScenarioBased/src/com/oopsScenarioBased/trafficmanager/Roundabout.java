package com.oopsScenarioBased.trafficmanager;

class Roundabout {
    private Vehicle head = null;

    // Add vehicle
    void addVehicle(String name) {
        if (name == null) return;

        Vehicle v = new Vehicle(name);

        if (head == null) {
            head = v;
            v.next = head;
        } else {
            Vehicle temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = v;
            v.next = head;
        }
        System.out.println(name + " entered roundabout");
    }

    // Remove vehicle
    void removeVehicle(String name) {
        if (head == null) {
            System.out.println("Roundabout empty");
            return;
        }

        Vehicle curr = head, prev = null;

        do {
            if (curr.name.equals(name)) {
                if (curr == head && curr.next == head) {
                    head = null;
                } else {
                    if (curr == head) head = head.next;
                    prev = curr.next;
                }
                System.out.println(name + " exited roundabout");
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);

        System.out.println("Vehicle not found");
    }

    // Display roundabout
    void display() {
        if (head == null) {
            System.out.println("Roundabout empty");
            return;
        }

        Vehicle temp = head;
        System.out.print("Roundabout: ");
        do {
            System.out.print(temp.name + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(back to start)");
    }
}
