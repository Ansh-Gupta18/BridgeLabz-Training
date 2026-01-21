package com.movietime;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class TheaterApp {

    public static void main(String[] args) {

        List<MovieShow> shows = new ArrayList<>();

        // Nearly sorted list
        shows.add(new MovieShow("Avatar", LocalTime.of(10, 0)));
        shows.add(new MovieShow("Inception", LocalTime.of(12, 30)));
        shows.add(new MovieShow("Interstellar", LocalTime.of(15, 0)));

        // New shows added during the day
        shows.add(new MovieShow("Oppenheimer", LocalTime.of(11, 15)));
        shows.add(new MovieShow("Dune", LocalTime.of(18, 45)));

        // Sort using Insertion Sort
        ShowSorter.insertionSort(shows);

        System.out.println(" Sorted Movie Show Timings:");
        for (MovieShow show : shows) {
            System.out.println(show);
        }
    }
}

