package com.kodilla.testing.shape;

public class Square implements Shape {
    String shapeName;
    public Square(String shapeName, double field) {
        this.shapeName = shapeName;
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
