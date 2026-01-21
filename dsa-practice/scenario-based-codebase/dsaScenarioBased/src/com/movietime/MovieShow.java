package com.movietime;

import java.time.LocalTime;

public class MovieShow {
    private String movieName;
    private LocalTime showTime;

    public MovieShow(String movieName, LocalTime showTime) {
        this.movieName = movieName;
        this.showTime = showTime;
    }

    public LocalTime getShowTime() {
        return showTime;
    }

    @Override
    public String toString() {
        return movieName + " - " + showTime;
    }
}

