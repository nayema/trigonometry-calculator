package com.nayema;

import java.text.DecimalFormat;

public interface TriangleCalculator {
    DecimalFormat formatter = new DecimalFormat("0.00");

    void calculateAll();
    void calculateDistances();
    void calculateAngles();
    void calculateArea();
}
