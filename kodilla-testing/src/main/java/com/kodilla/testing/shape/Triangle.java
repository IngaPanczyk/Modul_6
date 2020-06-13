package com.kodilla.testing.shape;

public class Triangle implements Shape {
    public Triangle(double fieldTriangle) {
        this.field = fieldTriangle;
    }

    public String getShapeName() {
        return "triangle";
    }
    double field;
    double a;
    double h;
    public double getField() {
        //field = 0.5 * a * h;
        return field;
    }
}