package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    ArrayList<Shape> shapeCollection = new ArrayList<>();

    public ArrayList addFigure(Shape shape){
        shapeCollection.add(shape);
        return shapeCollection;
    }
    public ArrayList removeFigure(int n) {
        shapeCollection.remove(n);
        return shapeCollection;
    }
    public Shape getFigure(int n) {
        Shape getFigure = shapeCollection.get(n);
        return getFigure;
    }
    public ArrayList showFigures(){
        return shapeCollection;

    }
}
