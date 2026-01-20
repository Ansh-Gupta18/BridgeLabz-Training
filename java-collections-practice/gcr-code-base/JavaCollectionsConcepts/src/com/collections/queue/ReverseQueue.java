package com.collections.queue;

import java.util.LinkedList;
import java.util.Queue;

public class ReverseQueue {

    // Recursive function to reverse the queue
    static void reverseQueue(Queue<Integer> queue) {
        if (queue.isEmpty()) {
            return;
        }

        // Remove front element
        int front = queue.remove();

        // Reverse remaining queue
        reverseQueue(queue);

        // Add removed element at the end
        queue.add(front);
    }

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);

        reverseQueue(queue);

        System.out.println(queue);
    }
}
