package com.kodilla.testing.collection;

import org.junit.After;
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
        numbers.add(1);
        numbers.add(2);
        numbers.add(8);
        numbers.add(13);
        //When
        if (numbers.size() == 0) {
            //Then
            System.out.println("List is empty! Test OK!");
        } else {
            System.out.println("List is not empty!Look at test for NormalList");
        }
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

        for (int i : oddNumber.exterminate(numbers)) {
            if (i % 2 != 0){
                System.out.println("Error!  Now in the list are odd even numbers");
            }else{
                System.out.println("Test OK! Now in the list are only even numbers");
            }
        }
    }
}
