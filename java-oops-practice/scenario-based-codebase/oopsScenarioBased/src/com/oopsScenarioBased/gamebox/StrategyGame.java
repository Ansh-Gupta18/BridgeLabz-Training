package com.oopsScenarioBased.gamebox;

class StrategyGame extends Game implements IDownloadable {

    public StrategyGame(String title, double price, double rating) {
        super(title, "Strategy", price, rating);
    }

    @Override
    public void download() {
        System.out.println(title + " downloaded successfully!");
    }

    @Override
    public void playDemo() {
        System.out.println("Playing slow, thinking-based strategy demo...");
    }
}

