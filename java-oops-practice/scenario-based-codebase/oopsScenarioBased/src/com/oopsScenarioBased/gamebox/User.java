package com.oopsScenarioBased.gamebox;

import java.util.*;

class User {
    private String name;
    private List<Game> ownedGames;

    public User(String name) {
        this.name = name;
        ownedGames = new ArrayList<>();
    }

    public void buyGame(Game game) {
        ownedGames.add(game);
        System.out.println(game.title + " added to your library.");
    }

    public void showOwnedGames() {
        System.out.println("Owned Games:");
        for (Game g : ownedGames) {
            System.out.println("- " + g.title + " (" + g.genre + ")");
        }
    }
}
