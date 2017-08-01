package com.nayema;

public class TriangleCalculateAll extends Triangle {

    public void calculateAll() {
        Point pointA = pointPrompt("a");
        Point pointB = pointPrompt("b");
        Point pointC = pointPrompt("c");

        double distanceAB = distance(pointA, pointB);
        double distanceAC = distance(pointA, pointC);
        double distanceBC = distance(pointB, pointC);

        double angleA = angle(distanceBC, distanceAC, distanceAB);
        double angleB = angle(distanceAC, distanceAB, distanceBC);
        double angleC = 180 - (angleA + angleB);

        double area = area(distanceAB, distanceBC, distanceAC);

        System.out.println(" ");
        System.out.println("Distance of Sides");
        System.out.println("#############################");
        System.out.println("Point A to B: " + formatter.format(distanceAB));
        System.out.println("Point A to C: " + formatter.format(distanceAC));
        System.out.println("Point B to C: " + formatter.format(distanceBC));

        System.out.println(" ");
        System.out.println("Angle at each Point:");
        System.out.println("#############################");
        System.out.println("Angle A: " + formatter.format(angleA));
        System.out.println("Angle B: " + formatter.format(angleB));
        System.out.println("Angle C: " + formatter.format(angleC));

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
}