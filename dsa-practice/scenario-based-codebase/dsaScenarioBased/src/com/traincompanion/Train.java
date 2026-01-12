package com.traincompanion;

public class Train {
    private CompartmentNode head;
    private CompartmentNode tail;

    // Add compartment at end
    public void addCompartment(String name) {
        CompartmentNode newNode = new CompartmentNode(name);

        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        System.out.println("Added: " + name);
    }

    // Remove a compartment
    public void removeCompartment(String name) {
        CompartmentNode temp = head;

        while (temp != null) {
            if (temp.name.equals(name)) {

                if (temp.prev != null)
                    temp.prev.next = temp.next;
                else
                    head = temp.next;

                if (temp.next != null)
                    temp.next.prev = temp.prev;
                else
                    tail = temp.prev;

                System.out.println("Removed: " + name);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Compartment not found");
    }

    // Forward traversal
    public void traverseForward() {
        CompartmentNode temp = head;
        System.out.print("Forward: ");
        while (temp != null) {
            System.out.print(temp.name + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Backward traversal
    public void traverseBackward() {
        CompartmentNode temp = tail;
        System.out.print("Backward: ");
        while (temp != null) {
            System.out.print(temp.name + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

    // Show adjacent compartments
    public void showAdjacent(String name) {
        CompartmentNode temp = head;

        while (temp != null) {
            if (temp.name.equals(name)) {
                System.out.println("Current: " + temp.name);
                System.out.println("Previous: " + 
                    (temp.prev != null ? temp.prev.name : "None"));
                System.out.println("Next: " + 
                    (temp.next != null ? temp.next.name : "None"));
                return;
            }
            temp = temp.next;
        }
        System.out.println("Compartment not found");
    }
}
