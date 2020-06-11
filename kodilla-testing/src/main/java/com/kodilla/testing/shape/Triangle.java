package com.kodilla.testing.shape;

public class Triangle implements Shape {
    String shapeName;

    public Triangle(String shapeName, double field) {
        this.shapeName = shapeName;
        this.field = field;
    }

    public String getShapeName() {
        return "triangle";
    }
    double field;
    double a;
    double h;
    public double getField() {
        field = 0.5 * a * h;
        return field;
    }
}