package com.tailorshop;

import java.util.List;

public class OrderSorter {

    // Insertion Sort by delivery deadline
    public static void insertionSort(List<Order> orders) {

        for (int i = 1; i < orders.size(); i++) {
            Order key = orders.get(i);
            int j = i - 1;

            while (j >= 0 &&
                   orders.get(j).getDeliveryDate().isAfter(key.getDeliveryDate())) {
                orders.set(j + 1, orders.get(j));
                j--;
            }

            orders.set(j + 1, key);
        }
    }
}

