package com.collections.queue;

import java.util.Arrays;

class CircularBuffer {
    private int[] buffer;
    private int capacity;
    private int front;   // Points to the oldest element
    private int size;

    CircularBuffer(int capacity) {
        this.capacity = capacity;
        this.buffer = new int[capacity];
        this.front = 0;
        this.size = 0;
    }

    // Insert element into the buffer
    public void insert(int value) {
        int rear = (front + size) % capacity; // calculate rear index
        buffer[rear] = value;

        if (size < capacity) {
            size++;
        } else {
            // buffer full → overwrite oldest element
            front = (front + 1) % capacity;
        }
    }

    // Get current buffer as array
    public int[] getBuffer() {
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = buffer[(front + i) % capacity];
        }
        return result;
    }
}

public class CircularBufferDemo {
    public static void main(String[] args) {
        CircularBuffer buffer = new CircularBuffer(3);

        buffer.insert(1);
        buffer.insert(2);
        buffer.insert(3);
        System.out.println("Buffer: " + Arrays.toString(buffer.getBuffer())); // [1,2,3]

        buffer.insert(4);
        System.out.println("Buffer: " + Arrays.toString(buffer.getBuffer())); // [2,3,4]

        buffer.insert(5);
        System.out.println("Buffer: " + Arrays.toString(buffer.getBuffer())); // [3,4,5]
    }
}
