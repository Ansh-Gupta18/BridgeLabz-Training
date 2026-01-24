package com.binarysearchtree;

import java.util.Map;
import java.util.TreeMap;

public class MusicLibrary {

    // TreeMap: Song Title -> Song Details (Alphabetical order)
    private TreeMap<String, Song> library = new TreeMap<>();

    // Song class
    static class Song {
        int trackId;
        String artist;

        Song(int trackId, String artist) {
            this.trackId = trackId;
            this.artist = artist;
        }

        @Override
        public String toString() {
            return "Track ID: " + trackId + ", Artist: " + artist;
        }
    }

    // 🔹 Scenario 1: Search Track using Track ID
    public void searchByTrackId(int trackId) {
        for (Map.Entry<String, Song> entry : library.entrySet()) {
            if (entry.getValue().trackId == trackId) {
                System.out.println("Song Found: " + entry.getKey() + " -> " + entry.getValue());
                return;
            }
        }
        System.out.println("Song not found!");
    }

    // 🔹 Scenario 2: Insert New Track
    public void addSong(int trackId, String title, String artist) {
        library.put(title, new Song(trackId, artist));
        System.out.println("Song added: " + title);
    }

    // 🔹 Scenario 3: Show Playlist Alphabetically (In-order traversal)
    public void showPlaylist() {
        System.out.println("\nPlaylist (Alphabetical Order):");
        for (Map.Entry<String, Song> entry : library.entrySet()) {
            System.out.println("Title: " + entry.getKey() + " | " + entry.getValue());
        }
    }

    // Main Method
    public static void main(String[] args) {
        MusicLibrary app = new MusicLibrary();

        // Insert Songs
        app.addSong(101, "Believer", "Imagine Dragons");
        app.addSong(102, "Attention", "Charlie Puth");
        app.addSong(103, "Closer", "Chainsmokers");

        // Search by Track ID
        app.searchByTrackId(102);

        // Display Playlist Alphabetically
        app.showPlaylist();
    }
}

