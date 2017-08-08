package com.nayema;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Triangle2DMenu implements TriangleCalculator {
    DecimalFormat formatter = new DecimalFormat("0.00");

    private Triangle2D cachedTriangle;

    public void calculateAll() {
        calculateDistances();
        calculateAngles();
        calculateArea();
        determineDistanceType();
        determineAngleType();
    }

    public void calculateDistances() {
        Triangle2D triangle = getOrPromptForTriangle();

        printDistances(triangle.getDistanceAB(), triangle.getDistanceAC(), triangle.getDistanceBC());
    }

    public void calculateAngles() {
        Triangle2D triangle = getOrPromptForTriangle();

        printAngles(triangle.getAngleA(), triangle.getAngleB(), triangle.getAngleC());
    }

    public void calculateArea() {
        Triangle2D triangle = getOrPromptForTriangle();

        printArea(triangle.getArea());
    }

    public void determineDistanceType() {
        Triangle2D triangle = getOrPromptForTriangle();

        printDistanceType(triangle);
    }

    public void determineAngleType() {
        Triangle2D triangle = getOrPromptForTriangle();

        printAngleType(triangle);
    }

    private Triangle2D getOrPromptForTriangle() {
        if (this.cachedTriangle == null) {
            Point2D pointA = pointPrompt("a");
            Point2D pointB = pointPrompt("b");
            Point2D pointC = pointPrompt("c");

            this.cachedTriangle = new Triangle2D(pointA, pointB, pointC);
        }
        return this.cachedTriangle;
    }

    private Point2D pointPrompt(String pointName) {
        double x = coordinatePrompt("x", pointName);
        double y = coordinatePrompt("y", pointName);
        return new Point2D(x, y);
    }

    private double coordinatePrompt(String coordinate, String point) {
        System.out.println("What is the " + coordinate + " coordinate for Point " + point + "?");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    private void printDistances(double distanceAB, double distanceAC, double distanceBC) {
        System.out.println("Distance of Sides");
        System.out.println("#############################");
        System.out.println("Point A to B: " + formatter.format(distanceAB));
        System.out.println("Point A to C: " + formatter.format(distanceAC));
        System.out.println("Point B to C: " + formatter.format(distanceBC));
    }

    private void printAngles(double angleA, double angleB, double angleC) {
        System.out.println("Angle at each Point:");
        System.out.println("#############################");
        System.out.println("Angle A: " + formatter.format(angleA));
        System.out.println("Angle B: " + formatter.format(angleB));
        System.out.println("Angle C: " + formatter.format(angleC));
    }

    private void printArea(double area) {
        System.out.println("Area: " + formatter.format(area));
    }

    private void printDistanceType(Triangle2D triangle) {
        if ((triangle.getDistanceAB() == triangle.getDistanceBC()) || (triangle.getDistanceAB() == triangle.getDistanceAC()) || (triangle.getDistanceBC() == triangle.getDistanceAC())) {
            System.out.println("This is an Isosceles TriangleCalculator");
        } else if ((triangle.getDistanceAB() == triangle.getDistanceBC() && triangle.getDistanceBC() == triangle.getDistanceAC())) {
            System.out.println("This is an Equilateral TriangleCalculator");
        } else {
            System.out.println("This is a Scalene TriangleCalculator");
        }
    }

    private void printAngleType(Triangle2D triangle) {
        if (triangle.getAngleA() < 90 && triangle.getAngleB() < 90 && triangle.getAngleC() < 90) {
            System.out.println("This is an Acute Angle TriangleCalculator");
        } else if (triangle.getAngleA() == 90 || triangle.getAngleB() == 90 || triangle.getAngleC() == 90) {
            System.out.println("This is a Right Angle TriangleCalculator");
        } else if (triangle.getAngleA() > 90 || triangle.getAngleB() > 90 || triangle.getAngleC() > 90) {
            System.out.println("This is an Obtuse Angle TriangleCalculator");
        } else {
            System.out.println("Error");
        }
    }
}