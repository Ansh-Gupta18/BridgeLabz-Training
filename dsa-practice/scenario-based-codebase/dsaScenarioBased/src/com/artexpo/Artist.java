package com.artexpo;

class Artist {
    String name;
    int registrationTime; // smaller value = earlier registration

    Artist(String name, int registrationTime) {
        this.name = name;
        this.registrationTime = registrationTime;
    }
}
