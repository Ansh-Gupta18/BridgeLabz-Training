package com.collections.list;

import java.util.LinkedList;

//Nth from end
public class NthFromEnd {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        int n = 2;

        int first = 0;
        int second = 0;

        // move first pointer n steps ahead
        for (int i = 0; i < n; i++) {
            first++;
        }

        // move both pointers until first reaches end
        while (first < list.size()) {
            first++;
            second++;
        }

        System.out.println("Nth element from end: " + list.get(second));
    }
}

