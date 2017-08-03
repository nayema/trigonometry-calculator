package com.nayema;

import java.text.DecimalFormat;

abstract public class Triangle {
    DecimalFormat formatter = new DecimalFormat("0.00");

    public abstract void calculateDistances();

    public abstract void calculateAngles();

    public abstract void calculateArea();

    public abstract void calculateAll();
}
