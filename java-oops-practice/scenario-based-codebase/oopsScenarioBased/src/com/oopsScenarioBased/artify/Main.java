package com.oopsScenarioBased.artify;

public class Main {
    public static void main(String[] args) {

        User user = new User("Ansh", 1000);

        Artwork art1 = new DigitalArt("Sunset", "Alex", 300);
        Artwork art2 = new PrintArt("Mountain", "Emma", 500);

        art1.purchase(user);
        art1.license();

        art2.purchase(user);
        art2.license();

        System.out.println("Remaining Balance: " + user.walletBalance);
    }
}
