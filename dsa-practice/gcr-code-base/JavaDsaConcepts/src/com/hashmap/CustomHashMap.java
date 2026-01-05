package com.hashmap;

public class CustomHashMap {

    // Node class for Linked List
    static class Node {
        int key;
        int value;
        Node next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    // HashMap variables
    private static final int SIZE = 5;
    private Node[] table = new Node[SIZE];

    // Hash function
    private int hash(int key) {
        return key % SIZE;
    }

    // Insert or Update value
    public void put(int key, int value) {
        int index = hash(key);
        Node head = table[index];

        // Update if key exists
        while (head != null) {
            if (head.key == key) {
                head.value = value;
                return;
            }
            head = head.next;
        }

        // Insert new node
        Node newNode = new Node(key, value);
        newNode.next = table[index];
        table[index] = newNode;
    }

    // Get value by key
    public int get(int key) {
        int index = hash(key);
        Node head = table[index];

        while (head != null) {
            if (head.key == key) {
                return head.value;
            }
            head = head.next;
        }
        return -1; // Not found
    }

    // Remove key
    public void remove(int key) {
        int index = hash(key);
        Node head = table[index];
        Node prev = null;

        while (head != null) {
            if (head.key == key) {
                if (prev == null) {
                    table[index] = head.next;
                } else {
                    prev.next = head.next;
                }
                return;
            }
            prev = head;
            head = head.next;
        }
    }

    // Display HashMap
    public void display() {
        for (int i = 0; i < SIZE; i++) {
            System.out.print("Bucket " + i + ": ");
            Node head = table[i];
            while (head != null) {
                System.out.print("[" + head.key + "=" + head.value + "] ");
                head = head.next;
            }
            System.out.println();
        }
    }

    // Main method (Testing)
    public static void main(String[] args) {
        CustomHashMap map = new CustomHashMap();

        map.put(1, 10);
        map.put(2, 20);
        map.put(6, 60); // Collision example
        map.put(3, 30);

        map.display();

        System.out.println("Get key 2: " + map.get(2));

        map.remove(1);
        map.display();
    }
}
