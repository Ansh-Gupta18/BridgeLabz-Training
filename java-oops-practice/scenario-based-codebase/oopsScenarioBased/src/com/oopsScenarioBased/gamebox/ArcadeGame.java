package com.oopsScenarioBased.gamebox;

class ArcadeGame extends Game implements IDownloadable {

    public ArcadeGame(String title, double price, double rating) {
        super(title, "Arcade", price, rating);
    }

    @Override
    public void download() {
        System.out.println(title + " downloaded successfully!");
    }

    @Override
    public void playDemo() {
        System.out.println("Playing fast-paced arcade demo...");
    }
}

