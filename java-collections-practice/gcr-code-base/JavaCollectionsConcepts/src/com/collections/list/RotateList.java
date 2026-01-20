package com.collections.list;

import java.util.*;

//Rotate list
public class RotateList {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        int k = 2;  // rotate by 2

        List<Integer> rotated = new ArrayList<>();

        // add elements from k to end
        for (int i = k; i < list.size(); i++) {
            rotated.add(list.get(i));
        }

        // add first k elements
        for (int i = 0; i < k; i++) {
            rotated.add(list.get(i));
        }

        System.out.println(rotated);
    }
}
