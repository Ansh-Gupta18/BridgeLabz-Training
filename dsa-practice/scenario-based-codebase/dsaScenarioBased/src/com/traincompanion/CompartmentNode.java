package com.traincompanion;

public class CompartmentNode {
    String name;
    CompartmentNode prev;
    CompartmentNode next;

    public CompartmentNode(String name) {
        this.name = name;
        this.prev = null;
        this.next = null;
    }
}
