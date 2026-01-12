package com.browserbuddy;

public class Main {
    public static void main(String[] args) {

        ClosedTabManager manager = new ClosedTabManager();

        Tab tab1 = new Tab("google.com");
        tab1.getHistory().visit("youtube.com");
        tab1.getHistory().visit("github.com");

        tab1.getHistory().back();
        tab1.getHistory().forward();

        manager.closeTab(tab1);

        Tab restoredTab = manager.reopenTab();
        if (restoredTab != null) {
            System.out.println("Current page: " +
                restoredTab.getHistory().getCurrentPage());
        }
    }
}

