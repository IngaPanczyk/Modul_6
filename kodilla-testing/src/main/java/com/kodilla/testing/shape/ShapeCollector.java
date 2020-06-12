package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    public ArrayList addFigure(Shape shape){
        ArrayList<Shape> shapeCollection = new ArrayList<>();
        shapeCollection.add(shape);
        return shapeCollection;
    }
    public ArrayList removeFigure(int n) {
        ArrayList<Shape> shapeCollection = new ArrayList<>();
        shapeCollection.remove(n);
        return shapeCollection;
    }
    public Shape getFigure(int n) {
        ArrayList<Shape> shapeCollection = new ArrayList<>();
        shapeCollection.get(n);
        return shapeCollection.get(n);
    }
    public ArrayList showFigures(){
        ArrayList<Shape> shapeCollection = new ArrayList<>();
        return shapeCollection;

    }
}
