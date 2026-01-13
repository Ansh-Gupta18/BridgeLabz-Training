package com.oopsScenarioBased.gamebox;

class Game {
    protected String title;
    protected String genre;
    protected double price;
    protected double rating;

    // Constructor for paid game
    public Game(String title, String genre, double price, double rating) {
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.rating = rating;
    }

    // Constructor for free game
    public Game(String title, String genre) {
        this(title, genre, 0.0, 0.0);
    }

    // Operator usage (seasonal discount)
    public double applyOffer(double discount) {
        return price - (price * discount / 100);
    }
}

