package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    ArrayList<Shape> shapeCollection = new ArrayList<>();

    public void addFigure(Shape shape){
        shapeCollection.add(shape);
    }
    public void removeFigure(int n) {
        shapeCollection.remove(n);
    }
    public Shape getFigure(int n) {
        Shape getFigure = shapeCollection.get(n);
        return getFigure;
    }
    public ArrayList showFigures(){
        return shapeCollection;

    }
}
