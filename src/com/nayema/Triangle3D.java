package com.nayema;

public class Triangle3D extends Triangle2D {
    Point3D pointA;
    Point3D pointB;
    Point3D pointC;

    public Triangle3D(Point3D pointA, Point3D pointB, Point3D pointC) {
        super(pointA, pointB, pointC);
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

    public double getAngleA() {
        return angle(this.getDistanceBC(), this.getDistanceAC(), this.getDistanceAB());
    }

    public double getAngleB() {
        return angle(this.getDistanceAC(), this.getDistanceAB(), this.getDistanceBC());
    }

    public double getAngleC() {
        return 180 - (this.getAngleA() + this.getAngleB());
    }

    public double getArea() {
        return area(this.getDistanceAB(), this.getDistanceBC(), this.getDistanceAC());
    }

    private double distance(Point3D starting, Point3D ending) {
        return Math.sqrt(Math.pow(ending.x - starting.x, 2) + Math.pow(ending.y - starting.y, 2) + Math.pow(ending.z - starting.z, 2));
    }

    private double angle(double a, double b, double c) {
        return Math.acos((Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2)) / (2 * a * b * c));
    }

    private double area(double a, double b, double c) {
        double s = 0.5 * (a + b + c);
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
