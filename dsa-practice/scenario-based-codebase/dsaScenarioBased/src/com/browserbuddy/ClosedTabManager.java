package com.browserbuddy;

import java.util.Stack;

public class ClosedTabManager {
    private Stack<Tab> closedTabs = new Stack<>();

    public void closeTab(Tab tab) {
        closedTabs.push(tab);
        System.out.println("Tab closed");
    }

    public Tab reopenTab() {
        if (!closedTabs.isEmpty()) {
            System.out.println("Tab restored");
            return closedTabs.pop();
        }
        System.out.println("No tabs to restore");
        return null;
    }
}

