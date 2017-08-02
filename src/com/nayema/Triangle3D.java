package com.nayema;

import java.text.DecimalFormat;

public class Triangle3D extends Triangle2D {
    public void calculateDistances() {
        Point3D pointA = pointPrompt("a");
        Point3D pointB = pointPrompt("b");
        Point3D pointC = pointPrompt("c");

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
        Point3D pointA = pointPrompt("a");
        Point3D pointB = pointPrompt("b");
        Point3D pointC = pointPrompt("c");

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
        Point3D pointA = pointPrompt("a");
        Point3D pointB = pointPrompt("b");
        Point3D pointC = pointPrompt("c");

        double distanceAB = distance(pointA, pointB);
        double distanceAC = distance(pointA, pointC);
        double distanceBC = distance(pointB, pointC);

        double area = area(distanceAB, distanceBC, distanceAC);

        System.out.println("Area: " + formatter.format(area));
    }

    public void calculateAll() {
        Point3D pointA = pointPrompt("a");
        Point3D pointB = pointPrompt("b");
        Point3D pointC = pointPrompt("c");

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
    }

    protected Point3D pointPrompt(String pointName) {
        double x = coordinatePrompt("x", pointName);
        double y = coordinatePrompt("y", pointName);
        double z = coordinatePrompt("z", pointName);
        return new Point3D(x, y, z);
    }

    protected double distance(Point3D starting, Point3D ending) {
        return Math.sqrt(Math.pow(ending.x - starting.x, 2) + Math.pow(ending.y - starting.y, 2) + Math.pow(ending.z - starting.z, 2));
    }
}
