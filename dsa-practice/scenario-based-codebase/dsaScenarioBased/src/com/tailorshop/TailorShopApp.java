package com.tailorshop;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TailorShopApp {

    public static void main(String[] args) {

        List<Order> orders = new ArrayList<>();

        // Nearly sorted orders
        orders.add(new Order("ORD101", LocalDate.of(2026, 1, 25)));
        orders.add(new Order("ORD102", LocalDate.of(2026, 1, 27)));
        orders.add(new Order("ORD103", LocalDate.of(2026, 1, 30)));

        // New orders received
        orders.add(new Order("ORD104", LocalDate.of(2026, 1, 26)));
        orders.add(new Order("ORD105", LocalDate.of(2026, 1, 28)));

        // Apply insertion sort
        OrderSorter.insertionSort(orders);

        System.out.println("TailorShop – Orders by Delivery Deadline:");
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}
