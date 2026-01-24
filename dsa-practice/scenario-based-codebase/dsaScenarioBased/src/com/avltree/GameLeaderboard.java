package com.avltree;

import java.util.*;

public class GameLeaderboard {

    // TreeSet to maintain sorted ranking
    private TreeSet<Player> leaderboard = new TreeSet<>();

    // Player class
    static class Player implements Comparable<Player> {
        String name;
        int score;

        Player(String name, int score) {
            this.name = name;
            this.score = score;
        }

        // Sort by score (descending), then name
        @Override
        public int compareTo(Player other) {
            if (this.score != other.score)
                return Integer.compare(other.score, this.score);
            return this.name.compareTo(other.name);
        }

        @Override
        public String toString() {
            return name + " : " + score + " pts";
        }
    }

    // 🔹 Scenario 1: Insert or Update Player
    public void addOrUpdatePlayer(String name, int score) {
        leaderboard.removeIf(p -> p.name.equals(name)); // remove old record
        leaderboard.add(new Player(name, score));
        System.out.println("Player updated: " + name);
    }

    // 🔹 Scenario 2: Display Top 10 Players
    public void displayTopPlayers() {
        System.out.println("\n Top Players:");
        int count = 0;
        for (Player p : leaderboard) {
            System.out.println(p);
            if (++count == 10) break;
        }
    }

    // 🔹 Scenario 3: Remove Player
    public void removePlayer(String name) {
        boolean removed = leaderboard.removeIf(p -> p.name.equals(name));
        System.out.println(removed ? "Player removed: " + name : "Player not found!");
    }

    // Main Method
    public static void main(String[] args) {
        GameLeaderboard game = new GameLeaderboard();

        // Insert / Update Players
        game.addOrUpdatePlayer("Ansh", 1500);
        game.addOrUpdatePlayer("Rahul", 1800);
        game.addOrUpdatePlayer("Priya", 1700);
        game.addOrUpdatePlayer("Ansh", 1900); // score update

        // Display Top Players
        game.displayTopPlayers();

        // Remove Player
        game.removePlayer("Rahul");

        // Updated Leaderboard
        game.displayTopPlayers();
    }
}
