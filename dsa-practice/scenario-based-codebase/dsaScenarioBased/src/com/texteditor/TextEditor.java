package com.texteditor;

import java.util.Stack;

public class TextEditor {

    private String content = "";
    private Stack<Action> undoStack = new Stack<>();
    private Stack<Action> redoStack = new Stack<>();

    // Insert text
    public void insert(String text) {
        content += text;
        undoStack.push(new Action("INSERT", text));
        redoStack.clear(); // clear redo after new action
    }

    // Delete text
    public void delete(String text) {
        if (content.endsWith(text)) {
            content = content.substring(0, content.length() - text.length());
            undoStack.push(new Action("DELETE", text));
            redoStack.clear();
        }
    }

    // Undo operation
    public void undo() {
        if (!undoStack.isEmpty()) {
            Action action = undoStack.pop();

            if (action.type.equals("INSERT")) {
                content = content.substring(0, content.length() - action.text.length());
            } else if (action.type.equals("DELETE")) {
                content += action.text;
            }

            redoStack.push(action);
        }
    }

    // Redo operation
    public void redo() {
        if (!redoStack.isEmpty()) {
            Action action = redoStack.pop();

            if (action.type.equals("INSERT")) {
                content += action.text;
            } else if (action.type.equals("DELETE")) {
                content = content.substring(0, content.length() - action.text.length());
            }

            undoStack.push(action);
        }
    }

    public void showText() {
        System.out.println("Current Text: " + content);
    }
}

