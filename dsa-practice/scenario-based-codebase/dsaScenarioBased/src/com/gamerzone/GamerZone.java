package com.gamerzone;

public class GamerZone {

    public static void main(String[] args) {

        Player[] leaderboard = {
                new Player("Nova", 1450),
                new Player("Shadow", 980),
                new Player("Blaze", 1200),
                new Player("Rogue", 600),
                new Player("Phantom", 1200)
        };

        // Apply Quick Sort
        QuickSortUtil.quickSort(leaderboard, 0, leaderboard.length - 1);

        System.out.println(" GamerZone Leaderboard:");
        for (int i = 0; i < leaderboard.length; i++) {
            System.out.println((i + 1) + ". " + leaderboard[i]);
        }
    }
}

