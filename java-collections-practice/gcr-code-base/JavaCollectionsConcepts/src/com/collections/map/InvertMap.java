package com.collections.map;

import java.util.*;

public class InvertMap {
    public static void main(String[] args) {

        // Original map
        Map<String, Integer> originalMap = new HashMap<>();
        originalMap.put("A", 1);
        originalMap.put("B", 2);
        originalMap.put("C", 1);

        // Inverted map
        Map<Integer, List<String>> invertedMap = new HashMap<>();

        for (Map.Entry<String, Integer> entry : originalMap.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();

            // If value already exists, add key to list; else create new list
            invertedMap.computeIfAbsent(value, k -> new ArrayList<>()).add(key);
        }

        System.out.println(invertedMap);
    }
}

