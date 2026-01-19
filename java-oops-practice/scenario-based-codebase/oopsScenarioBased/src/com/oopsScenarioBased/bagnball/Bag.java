package com.oopsScenarioBased.bagnball;

import java.util.ArrayList;

class Bag implements Storable {

    private int bagId;
    private String color;
    private int capacity;
    private ArrayList<Ball> balls;

    public Bag(int bagId, String color, int capacity) {
        this.bagId = bagId;
        this.color = color;
        this.capacity = capacity;
        this.balls = new ArrayList<>();
    }

    // Add ball
    public void addBall(Ball ball) {
        if (balls.size() < capacity) {
            balls.add(ball);
            System.out.println("Ball added to Bag " + bagId);
        } else {
            System.out.println("Bag " + bagId + " is FULL! Cannot add ball.");
        }
    }

    // Remove ball by ID
    public void removeBall(int ballId) {
        for (Ball b : balls) {
            if (b.getBallId() == ballId) {
                balls.remove(b);
                System.out.println("Ball removed from Bag " + bagId);
                return;
            }
        }
        System.out.println("Ball not found in Bag " + bagId);
    }

    // Display balls in bag
    public void displayBalls() {
        System.out.println("\nBalls in Bag " + bagId + ":");
        if (balls.isEmpty()) {
            System.out.println("No balls in this bag.");
        } else {
            for (Ball b : balls) {
                b.displayInfo();
            }
        }
    }

    public int getBallCount() {
        return balls.size();
    }

    @Override
    public void displayInfo() {
        System.out.println("Bag ID: " + bagId +
                ", Color: " + color +
                ", Balls: " + balls.size() + "/" + capacity);
    }
}
