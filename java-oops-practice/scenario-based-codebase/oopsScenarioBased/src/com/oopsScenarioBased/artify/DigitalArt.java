package com.oopsScenarioBased.artify;

public class DigitalArt extends Artwork {

    public DigitalArt(String title, String artist, double price) {
        super(title, artist, price, "Digital License");
    }

    // Polymorphism
    public void license() {
        System.out.println("Digital Art License: Personal use only.");
    }
}
