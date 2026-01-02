package com.inheritance.restaurantmanagement;

public class Waiter extends RestaurantPerson implements Worker {

    public Waiter(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println("Waiter serves food");
    }
}
