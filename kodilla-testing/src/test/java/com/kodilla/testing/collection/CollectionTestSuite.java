package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {
    @Before
    public void before() {
        System.out.println("Test OddNumbersExterminator: START");
    }

    @After
    public void after() {
        System.out.println("Test OddNumbersExterminator: END");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        ArrayList<Integer> numbers = new ArrayList<>();
        //When
        int numbersSize = numbers.size();
        //Then
        Assert.assertEquals(0, numbersSize);
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(8);
        numbers.add(15);

        OddNumbersExterminator oddNumber = new OddNumbersExterminator();
        ArrayList<Integer> oddList = new ArrayList<>();

        ArrayList<Integer> listCheck = new ArrayList<>();
        listCheck.add(2);
        listCheck.add(8);
        //When
        oddList = oddNumber.exterminate(numbers);
        //Then
        Assert.assertEquals(listCheck, oddList);
    }
}

