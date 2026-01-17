package com.artexpo;

public class Main {
    public static void main(String[] args) {

        Artist[] artists = {
            new Artist("Ravi", 10),
            new Artist("Anita", 5),
            new Artist("Suresh", 8),
            new Artist("Neha", 3)
        };

        ArtExpo.insertionSort(artists);

        for (Artist a : artists) {
            System.out.println(a.name + " - " + a.registrationTime);
        }
    }
}


