package com.collections.queue;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicInteger;

class Patient {
    String name;
    int severity;
    int arrivalOrder; // To maintain order for same severity

    static AtomicInteger counter = new AtomicInteger(0); // auto-increment for arrival order

    Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
        this.arrivalOrder = counter.getAndIncrement();
    }
}

public class HospitalTriageSystem {
    public static void main(String[] args) {

        // PriorityQueue with comparator: higher severity first, then earlier arrival
        PriorityQueue<Patient> queue = new PriorityQueue<>(
            (p1, p2) -> {
                if (p2.severity != p1.severity) {
                    return p2.severity - p1.severity; // higher severity first
                } else {
                    return p1.arrivalOrder - p2.arrivalOrder; // earlier arrival first
                }
            }
        );

        // Add patients
        queue.add(new Patient("John", 3));
        queue.add(new Patient("Alice", 5));
        queue.add(new Patient("Bob", 2));
        queue.add(new Patient("Carol", 5)); // Same severity as Alice

        System.out.println("Treatment Order:");

        // Treat patients based on priority
        while (!queue.isEmpty()) {
            Patient patient = queue.poll();
            System.out.println(patient.name + " (Severity: " + patient.severity + ")");
        }
    }
}
