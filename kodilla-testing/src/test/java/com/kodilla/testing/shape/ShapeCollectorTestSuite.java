package com.kodilla.testing.shape;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class ShapeCollectorTestSuite {
    @Before
    public void before() {
        System.out.println("Test OddNumbersExterminator: START");
    }

    @After
    public void after() {
        System.out.println("Test OddNumbersExterminator: END");
    }

    @Test
    public void testAddFigure(Shape shape) {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape circle = new Circle(5.0);
        //When
        shapeCollector.addFigure(circle);
        //Then
        Assert.assertEquals(circle, shapeCollector.getFigure(0));
    }


   @Test
    public void testRemoveFigure(int n) {
      
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape circle = new Circle(4.5);
        Shape square = new Square(6.5);
        //When
        shapeCollector.removeFigure(0);
        //Then
        Assert.assertEquals(square, shapeCollector.getFigure(0));


    }

}
