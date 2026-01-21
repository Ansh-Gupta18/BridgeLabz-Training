package com.tailorshop;

import java.time.LocalDate;

public class Order {
    private String orderId;
    private LocalDate deliveryDate;

    public Order(String orderId, LocalDate deliveryDate) {
        this.orderId = orderId;
        this.deliveryDate = deliveryDate;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    @Override
    public String toString() {
        return orderId + " -> Delivery: " + deliveryDate;
    }
}

