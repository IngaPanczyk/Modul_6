package com.kodilla.testing.shape;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class ShapeCollectorTestSuite {
    @Test
    public void addFigure(){
        //Given
        ShapeCollector shapeCollector1 = new ShapeCollector ("square",4.0);
        ShapeCollector shapeCollector2 = new ShapeCollector ("square",9.0);
        ArrayList<ShapeCollector> shapeCollector = new ArrayList<>();
        shapeCollector.add(shapeCollector1);
        shapeCollector.add(shapeCollector2);
        //When
        Square square1 = new Square(Square,15);

        //ArrayList<Shape> shape = new ArrayList<>();


        //Then
    }

    @Test
    public void removeFigure(){
    }

    @Test
    public void getFigure(){
    }

    @Test
    public void showFigures(){
        //Given
        ShapeCollector shapeCollector1 = new ShapeCollector ("square",4.0);
        ShapeCollector shapeCollector2 = new ShapeCollector ("square",9.0);
        ArrayList<ShapeCollector> shapeCollector = new ArrayList<>();
        shapeCollector.add(shapeCollector1);
        shapeCollector.add(shapeCollector2);
        //When
        ArrayList<Shape> shape = new ArrayList<>();


        //Then
        Assert.assertEquals(shapeCollector, shape);
    }

}
