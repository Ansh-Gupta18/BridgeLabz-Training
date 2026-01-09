package com.oopsScenarioBased.foodloop;

public class Main{
    public static void main(String[] args) {

        FoodItem pizza = new VegItem("Pizza", 250, 5);
        FoodItem chicken = new NonVegItem("Chicken Burger", 300, 3);

        Order order = new Order(pizza, chicken); // combo meal
        order.placeOrder();
    }
}

