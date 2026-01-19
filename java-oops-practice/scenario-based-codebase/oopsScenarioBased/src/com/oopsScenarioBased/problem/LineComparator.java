package com.oopsScenarioBased.problem;
import java.util.ArrayList;

class LineComparator {

    private ArrayList<Line> lines = new ArrayList<>();

    // Add line to list
    public void addLine(Line line) {
        lines.add(line);
    }

    // Compare two lines
    public void compareLines(Line l1, Line l2) {
        double len1 = l1.getLength();
        double len2 = l2.getLength();

        System.out.println("\nLine 1 Length: " + len1);
        System.out.println("Line 2 Length: " + len2);

        if (len1 == len2) {
            System.out.println("Result: Both lines are equal in length.");
        } else if (len1 > len2) {
            System.out.println("Result: Line 1 is longer.");
        } else {
            System.out.println("Result: Line 2 is longer.");
        }
    }
}

