package com.collections.set;

import java.util.*;

public class SymmetricDifference {
    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);

        // Create a copy of set1
        Set<Integer> result = new HashSet<>(set1);

        // Add all elements of set2
        result.addAll(set2);

        // Create intersection
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);

        // Remove common elements
        result.removeAll(intersection);

        System.out.println(result);
    }
}
