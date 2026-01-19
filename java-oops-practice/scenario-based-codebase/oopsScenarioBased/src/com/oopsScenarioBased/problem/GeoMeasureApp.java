package com.oopsScenarioBased.problem;

import java.util.Scanner;

public class GeoMeasureApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LineComparator comparator = new LineComparator();

        System.out.println("Enter coordinates for Line 1:");
        Line line1 = new Line(
                sc.nextDouble(), sc.nextDouble(),
                sc.nextDouble(), sc.nextDouble()
        );

        System.out.println("Enter coordinates for Line 2:");
        Line line2 = new Line(
                sc.nextDouble(), sc.nextDouble(),
                sc.nextDouble(), sc.nextDouble()
        );

        comparator.addLine(line1);
        comparator.addLine(line2);

        comparator.compareLines(line1, line2);

        sc.close();
    }
}
