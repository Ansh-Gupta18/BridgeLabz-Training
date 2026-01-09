package com.oopsScenarioBased.artify;

public class Artwork implements IPurchasable {

    String title;
    String artist;
    double price;
    protected String licenseType;   // encapsulation

    // Constructor without preview
    public Artwork(String title, String artist, double price, String licenseType) {
        this.title = title;
        this.artist = artist;
        this.price = price;
        this.licenseType = licenseType;
    }

    // Constructor with preview
    public Artwork(String title, String artist, double price,
                   String licenseType, boolean preview) {
        this(title, artist, price, licenseType);
    }

    public void purchase(User user) {
        if (user.walletBalance >= price) {
            user.deductBalance(price);
            System.out.println(user.name + " purchased " + title);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public void license() {
        System.out.println("Standard license applied.");
    }
}
