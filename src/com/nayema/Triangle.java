package com.nayema;

import java.text.DecimalFormat;
import java.util.Scanner;

abstract class Triangle {
    DecimalFormat formatter = new DecimalFormat("0.00");

    public abstract void calculateDistances();

    public abstract void calculateAngles();

    public abstract void calculateArea();

    public abstract void calculateAll();

    protected abstract Point pointPrompt(String pointName);

    protected final double coordinatePrompt(String coordinate, String point) {
        System.out.println("What is the " + coordinate + " coordinate for Point " + point + "?");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    //TODO
    //protected abstract double distance(Point starting, Point ending);

    protected final double angle(double a, double b, double c) {
        return Math.acos((Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2)) / (2 * a * b * c));
    }

    protected final double area(double a, double b, double c) {
        double s = 0.5 * (a + b + c);
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
