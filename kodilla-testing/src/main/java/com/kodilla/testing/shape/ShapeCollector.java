package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    ArrayList<Shape> shapeCollection = new ArrayList<>();
    Shape shape = new Shape();

    public ArrayList addFigure(Shape shape){
        shapeCollection.add(shape);
        return shapeCollection;
    }
    public ArrayList removeFigure(int n) {
        shapeCollection.remove(n);
        return shapeCollection;
    }
    public Shape getFigure(int n) {
        shapeCollection.get(n);
        return shapeCollection.get(n);
    }
    public ArrayList showFigures(){
        return shapeCollection;

    }
}
