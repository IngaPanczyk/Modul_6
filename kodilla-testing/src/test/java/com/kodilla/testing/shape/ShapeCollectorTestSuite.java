package com.kodilla.testing.shape;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class ShapeCollectorTestSuite {
    @Before
    public void before() {
        System.out.println("Test: START");
    }

    @After
    public void after() {
        System.out.println("Test : END");
    }

    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape circle = new Circle(5.0);
        //When
        shapeCollector.addFigure(circle);
        //Then
        Assert.assertEquals(circle, shapeCollector.getFigure(0));
    }

    @Test
    public void testRemoveFigure() {

        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape circle = new Circle(4.5);
        Shape square = new Square(6.5);
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(square);
        //When
        shapeCollector.removeFigure(0);
        //Then
        Assert.assertEquals(square, shapeCollector.getFigure(0));


    }

}
