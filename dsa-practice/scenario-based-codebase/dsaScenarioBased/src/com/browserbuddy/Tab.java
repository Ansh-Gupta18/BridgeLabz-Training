package com.browserbuddy;

public class Tab {
    private BrowserHistory history;

    public Tab(String homepage) {
        history = new BrowserHistory(homepage);
    }

    public BrowserHistory getHistory() {
        return history;
    }
}

