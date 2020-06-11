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
        ArrayList<Integer> numbers = new ArrayList<>();
        Assert.assertEquals(numbers.size(), 0);
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(8);
        numbers.add(13);

        OddNumbersExterminator oddNumber = new OddNumbersExterminator();
        oddNumber.exterminate(numbers);

        ArrayList<Integer> listCheck = new ArrayList<>();
        listCheck.add(2);
        listCheck.add(8);

        Assert.assertEquals(oddNumber.exterminate(numbers), listCheck);
    }
}

