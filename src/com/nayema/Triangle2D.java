package com.nayema;

public class Triangle2D {
    Point2D pointA;
    Point2D pointB;
    Point2D pointC;

    public Triangle2D(Point2D pointA, Point2D pointB, Point2D pointC) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
    }

    public double getDistanceAB() {
        return distance(this.pointA, this.pointB);
    }

    public double getDistanceAC() {
        return distance(this.pointA, this.pointC);
    }

    public double getDistanceBC() {
        return distance(this.pointB, this.pointC);
    }

    private double distance(Point2D starting, Point2D ending) {
        return Math.sqrt(Math.pow(ending.x - starting.x, 2) + Math.pow(ending.y - starting.y, 2));
    }
}
