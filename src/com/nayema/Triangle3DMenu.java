package com.nayema;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Triangle3DMenu implements TriangleCalculator {
    DecimalFormat formatter = new DecimalFormat("0.00");

    private Triangle3D cachedTriangle;

    public void calculateAll() {
        System.out.println();
        calculateDistances();

        System.out.println();
        calculateAngles();

        System.out.println();
        calculateArea();
    }

    public void calculateDistances() {
        Triangle3D triangle = getOrPromptForTriangle();

        printDistances(triangle.getDistanceAB(), triangle.getDistanceAC(), triangle.getDistanceBC());
    }

    public void calculateAngles() {
        Triangle3D triangle = getOrPromptForTriangle();

        printAngles(triangle.getAngleA(), triangle.getAngleB(), triangle.getAngleC());
    }

    public void calculateArea() {
        Triangle3D triangle = getOrPromptForTriangle();

        printArea(triangle.getArea());
    }

    private Triangle3D getOrPromptForTriangle() {
        if (this.cachedTriangle == null) {
            Point3D pointA = pointPrompt("a");
            Point3D pointB = pointPrompt("b");
            Point3D pointC = pointPrompt("c");

            this.cachedTriangle = new Triangle3D(pointA, pointB, pointC);
        }
        return this.cachedTriangle;
    }

    private Point3D pointPrompt(String pointName) {
        double x = coordinatePrompt("x", pointName);
        double y = coordinatePrompt("y", pointName);
        double z = coordinatePrompt("z", pointName);
        return new Point3D(x, y, z);
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
}