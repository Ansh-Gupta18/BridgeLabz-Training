package com.browserbuddy;

public class BrowserHistory {
    private HistoryNode current;

    public BrowserHistory(String homepage) {
        current = new HistoryNode(homepage);
    }

    public void visit(String url) {
        HistoryNode newNode = new HistoryNode(url);
        current.next = newNode;
        newNode.prev = current;
        current = newNode;
        System.out.println("Visited: " + url);
    }

    public void back() {
        if (current.prev != null) {
            current = current.prev;
            System.out.println("Back to: " + current.url);
        } else {
            System.out.println("No previous page");
        }
    }

    public void forward() {
        if (current.next != null) {
            current = current.next;
            System.out.println("Forward to: " + current.url);
        } else {
            System.out.println("No next page");
        }
    }

    public String getCurrentPage() {
        return current.url;
    }
}
