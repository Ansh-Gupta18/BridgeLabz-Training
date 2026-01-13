package com.oopsScenarioBased.gamebox;

import java.util.Scanner;

public class GameBoxApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter user name: ");
        String userName = sc.nextLine();
        User user = new User(userName);

        System.out.println("Choose Game Type:");
        System.out.println("1. Arcade Game");
        System.out.println("2. Strategy Game");
        int choice = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter game title: ");
        String title = sc.nextLine();

        System.out.print("Enter game price: ");
        double price = sc.nextDouble();

        System.out.print("Enter game rating: ");
        double rating = sc.nextDouble();

        IDownloadable game;

        if (choice == 1) {
            game = new ArcadeGame(title, price, rating);
        } else {
            game = new StrategyGame(title, price, rating);
        }

        game.playDemo();
        game.download();

        System.out.print("Enter seasonal discount (%): ");
        double discount = sc.nextDouble();

        Game g = (Game) game;
        double finalPrice = g.applyOffer(discount);
        System.out.println("Final Price after discount: ₹" + finalPrice);

        user.buyGame(g);
        user.showOwnedGames();

        sc.close();
    }
}
