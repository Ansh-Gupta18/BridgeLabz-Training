package com.movietime;

import java.util.List;

public class ShowSorter {

    // Insertion Sort based on show time
    public static void insertionSort(List<MovieShow> shows) {
        for (int i = 1; i < shows.size(); i++) {
            MovieShow key = shows.get(i);
            int j = i - 1;

            while (j >= 0 && shows.get(j).getShowTime().isAfter(key.getShowTime())) {
                shows.set(j + 1, shows.get(j));
                j--;
            }
            shows.set(j + 1, key);
        }
    }
}

