package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {
    int numbers;

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
        ArrayList<Integer> listEven = new ArrayList<>();
        for (int number : numbers) {
            if (number % 2 == 0) {
                listEven.add(number);
            }
        }
        return listEven;
    }
}
