package com.oopsScenarioBased.bagnball;

import java.util.ArrayList;

public class ToyStoreApp {

    public static void main(String[] args) {

        Bag bag1 = new Bag(101, "Red", 3);
        Bag bag2 = new Bag(102, "Blue", 2);

        Ball b1 = new Ball(1, "Yellow", "Small");
        Ball b2 = new Ball(2, "Green", "Medium");
        Ball b3 = new Ball(3, "Blue", "Large");
        Ball b4 = new Ball(4, "Red", "Small");

        bag1.addBall(b1);
        bag1.addBall(b2);
        bag1.addBall(b3);
        bag1.addBall(b4); // should be prevented

        bag2.addBall(b4);

        bag1.displayBalls();
        bag2.displayBalls();

        bag1.removeBall(2);
        bag1.displayBalls();

        // Display all bags and their ball count
        System.out.println("\nAll Bags Summary:");
        ArrayList<Bag> bags = new ArrayList<>();
        bags.add(bag1);
        bags.add(bag2);

        for (Bag bag : bags) {
            bag.displayInfo();
        }
    }
}
