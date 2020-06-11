package com.kodilla.testing.shape;

public class Circle implements Shape{
    public Circle() {
        String shapeName;
        double field;
    }
    public String getShapeName() {
        return "figura";
    }
    double field;
    double r;
    public double getField () {
        field = 3.14 * r * r;
        return field;
    }
}
