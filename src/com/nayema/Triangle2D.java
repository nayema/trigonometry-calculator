package com.nayema;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Triangle2D {
    DecimalFormat formatter = new DecimalFormat("0.00");

    public void calculateDistances() {
        Point2D pointA = pointPrompt("a");
        Point2D pointB = pointPrompt("b");
        Point2D pointC = pointPrompt("c");

        double distanceAB = distance(pointA, pointB);
        double distanceAC = distance(pointA, pointC);
        double distanceBC = distance(pointB, pointC);

        DecimalFormat formatter = new DecimalFormat("0.00");

        System.out.println("Distance of Sides");
        System.out.println("#############################");
        System.out.println("Point A to B: " + formatter.format(distanceAB));
        System.out.println("Point A to C: " + formatter.format(distanceAC));
        System.out.println("Point B to C: " + formatter.format(distanceBC));
    }

    public void calculateAngles() {
        Point2D pointA = pointPrompt("a");
        Point2D pointB = pointPrompt("b");
        Point2D pointC = pointPrompt("c");

        double distanceAB = distance(pointA, pointB);
        double distanceAC = distance(pointA, pointC);
        double distanceBC = distance(pointB, pointC);

        double angleA = angle(distanceBC, distanceAC, distanceAB);
        double angleB = angle(distanceAC, distanceAB, distanceBC);
        double angleC = 180 - (angleA + angleB);

        System.out.println("Angle at each Point:");
        System.out.println("#############################");
        System.out.println("Angle A: " + formatter.format(angleA));
        System.out.println("Angle B: " + formatter.format(angleB));
        System.out.println("Angle C: " + formatter.format(angleC));
    }

    public void calculateArea() {
        Point2D pointA = pointPrompt("a");
        Point2D pointB = pointPrompt("b");
        Point2D pointC = pointPrompt("c");

        double distanceAB = distance(pointA, pointB);
        double distanceAC = distance(pointA, pointC);
        double distanceBC = distance(pointB, pointC);

        double area = area(distanceAB, distanceBC, distanceAC);

        System.out.println("Area: " + formatter.format(area));
    }

    public void determineTriangleType() {
        Point2D pointA = pointPrompt("a");
        Point2D pointB = pointPrompt("b");
        Point2D pointC = pointPrompt("c");

        double distanceAB = distance(pointA, pointB);
        double distanceAC = distance(pointA, pointC);
        double distanceBC = distance(pointB, pointC);

        if ((distanceAB == distanceBC) || (distanceAB == distanceAC) || (distanceBC == distanceAC)) {
            System.out.println("This is an Isosceles Triangle");
        } else if ((distanceAB == distanceBC && distanceBC == distanceAC)) {
            System.out.println("This is an Equilateral Triangle");
        } else {
            System.out.println("This is a Scalene Triangle");
        }
    }

    public void determineAngleType() {
        Point2D pointA = pointPrompt("a");
        Point2D pointB = pointPrompt("b");
        Point2D pointC = pointPrompt("c");

        double distanceAB = distance(pointA, pointB);
        double distanceAC = distance(pointA, pointC);
        double distanceBC = distance(pointB, pointC);

        double angleA = angle(distanceBC, distanceAC, distanceAB);
        double angleB = angle(distanceAC, distanceAB, distanceBC);
        double angleC = 180 - (angleA + angleB);

        if (angleA < 90 && angleB < 90 && angleC < 90) {
            System.out.println("This is an Acute Angle Triangle");
        } else if (angleA == 90 || angleB == 90 || angleC == 90) {
            System.out.println("This is a Right Angle Triangle");
        } else if (angleA > 90 || angleB > 90 || angleC > 90) {
            System.out.println("This is an Obtuse Angle Triangle");
        } else {
            System.out.println("Error");
        }
    }

    public void calculateAll() {
        Point2D pointA = pointPrompt("a");
        Point2D pointB = pointPrompt("b");
        Point2D pointC = pointPrompt("c");

        double distanceAB = distance(pointA, pointB);
        double distanceAC = distance(pointA, pointC);
        double distanceBC = distance(pointB, pointC);
        System.out.println(" ");
        System.out.println("Distance of Sides");
        System.out.println("#############################");
        System.out.println("Point A to B: " + formatter.format(distanceAB));
        System.out.println("Point A to C: " + formatter.format(distanceAC));
        System.out.println("Point B to C: " + formatter.format(distanceBC));

        double angleA = angle(distanceBC, distanceAC, distanceAB);
        double angleB = angle(distanceAC, distanceAB, distanceBC);
        double angleC = 180 - (angleA + angleB);
        System.out.println(" ");
        System.out.println("Angle at each Point:");
        System.out.println("#############################");
        System.out.println("Angle A: " + formatter.format(angleA));
        System.out.println("Angle B: " + formatter.format(angleB));
        System.out.println("Angle C: " + formatter.format(angleC));

        double area = area(distanceAB, distanceBC, distanceAC);
        System.out.println(" ");
        System.out.println("Area: " + formatter.format(area));

        System.out.println(" ");
        if ((distanceAB == distanceBC) || (distanceAB == distanceAC) || (distanceBC == distanceAC)) {
            System.out.println("This is an Isosceles Triangle");
        } else if ((distanceAB == distanceBC && distanceBC == distanceAC)) {
            System.out.println("This is an Equilateral Triangle");
        } else {
            System.out.println("This is a Scalene Triangle");
        }

        System.out.println(" ");
        if (angleA < 90 && angleB < 90 && angleC < 90) {
            System.out.println("This is an Acute Angle Triangle");
        } else if (angleA == 90 || angleB == 90 || angleC == 90) {
            System.out.println("This is a Right Angle Triangle");
        } else if (angleA > 90 || angleB > 90 || angleC > 90) {
            System.out.println("This is an Obtuse Angle Triangle");
        } else {
            System.out.println("Error");
        }
    }

    protected Point2D pointPrompt(String pointName) {
        double x = coordinatePrompt("x", pointName);
        double y = coordinatePrompt("y", pointName);
        return new Point2D(x, y);
    }

    protected double coordinatePrompt(String coordinate, String point) {
        System.out.println("What is the " + coordinate + " coordinate for Point " + point + "?");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    protected double distance(Point2D starting, Point2D ending) {
        return Math.sqrt(Math.pow(ending.x - starting.x, 2) + Math.pow(ending.y - starting.y, 2));
    }

    protected final double angle(double a, double b, double c) {
        return Math.acos((Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2)) / (2 * a * b * c));
    }

    protected final double area(double a, double b, double c) {
        double s = 0.5 * (a + b + c);
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}