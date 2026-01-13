package com.oopsScenarioBased.trafficmanager;

import java.util.LinkedList;
import java.util.Queue;

class EntryQueue {
    private Queue<String> queue = new LinkedList<>();
    private int limit = 3;

    void enqueue(String name) {
        if (queue.size() == limit) {
            System.out.println("Queue Overflow");
            return;
        }
        queue.add(name);
        System.out.println(name + " waiting to enter");
    }

    String dequeue() {
        if (queue.isEmpty()) {
            System.out.println("Queue Underflow");
            return null;
        }
        return queue.poll();
    }
}
