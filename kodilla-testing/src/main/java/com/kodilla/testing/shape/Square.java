package com.kodilla.testing.shape;

public class Square implements Shape {
    public Square(double field) {
        this.field = field;
    }

    public String getShapeName() {
        return "square";
    }
    double a;
    double field;
    public double getField() {
        field = a * a;
        return field;
    }
}
