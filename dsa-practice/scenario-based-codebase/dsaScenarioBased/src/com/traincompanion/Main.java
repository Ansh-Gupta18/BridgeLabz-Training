package com.traincompanion;

public class Main {
    public static void main(String[] args) {

        Train train = new Train();

        train.addCompartment("Engine");
        train.addCompartment("Sleeper");
        train.addCompartment("Pantry");
        train.addCompartment("AC");

        train.traverseForward();
        train.traverseBackward();

        train.showAdjacent("Pantry");

        train.removeCompartment("Sleeper");
        train.traverseForward();
    }
}

