package com.ambulanceroute;

public class AmbulanceRoute {

    private HospitalUnit head = null;

    // Add hospital unit to circular list
    public void addUnit(String name, boolean isAvailable) {
        HospitalUnit newUnit = new HospitalUnit(name, isAvailable);

        if (head == null) {
            head = newUnit;
            head.next = head;
            return;
        }

        HospitalUnit temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = newUnit;
        newUnit.next = head;
    }

    // Find nearest available unit
    public void redirectPatient() {
        if (head == null) {
            System.out.println("❌ No hospital units available!");
            return;
        }

        HospitalUnit temp = head;
        do {
            if (temp.isAvailable) {
                System.out.println(" Patient redirected to: " + temp.unitName);
                return;
            }
            temp = temp.next;
        } while (temp != head);

        System.out.println(" All units are currently unavailable!");
    }

    // Remove unit under maintenance
    public void removeUnit(String unitName) {
        if (head == null) return;

        HospitalUnit curr = head;
        HospitalUnit prev = null;

        do {
            if (curr.unitName.equals(unitName)) {

                // Single node case
                if (curr == head && curr.next == head) {
                    head = null;
                    return;
                }

                // Head removal
                if (curr == head) {
                    HospitalUnit last = head;
                    while (last.next != head) {
                        last = last.next;
                    }
                    head = head.next;
                    last.next = head;
                } else {
                    prev.next = curr.next;
                }

                System.out.println(" Unit removed (maintenance): " + unitName);
                return;
            }

            prev = curr;
            curr = curr.next;
        } while (curr != head);
    }

    // Display route
    public void displayUnits() {
        if (head == null) {
            System.out.println("No hospital units in route.");
            return;
        }

        HospitalUnit temp = head;
        do {
            System.out.print(temp.unitName + " → ");
            temp = temp.next;
        } while (temp != head);

        System.out.println("(Back to " + head.unitName + ")");
    }
}
