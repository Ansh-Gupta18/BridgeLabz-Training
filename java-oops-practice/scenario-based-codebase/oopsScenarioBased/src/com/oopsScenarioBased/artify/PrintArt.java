package com.oopsScenarioBased.artify;

public class PrintArt extends Artwork {

    public PrintArt(String title, String artist, double price) {
        super(title, artist, price, "Print License");
    }

    // Polymorphism
    public void license() {
        System.out.println("Print Art License: Limited prints allowed.");
    }
}
