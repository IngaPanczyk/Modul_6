package com.kodilla.testing.shape;

public class Circle implements Shape{
    public Circle(double field) {
        this.field = field;
    }

    public String getShapeName() {
        return "circle";
    }
    double field;
    double r;
    public double getField () {
        field = 3.14 * r * r;
        return field;
    }
}
