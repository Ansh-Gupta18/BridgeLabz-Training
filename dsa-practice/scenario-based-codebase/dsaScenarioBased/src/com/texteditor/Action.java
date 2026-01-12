package com.texteditor;

public class Action {
    String type;   // INSERT or DELETE
    String text;

    public Action(String type, String text) {
        this.type = type;
        this.text = text;
    }
}

