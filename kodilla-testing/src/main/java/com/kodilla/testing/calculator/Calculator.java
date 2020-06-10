package com.kodilla.testing.calculator;

public class Calculator {
    private int a;
    private int b;
    private int score1;
    private int score2;

    public int getScore1() {
        return score1;
    }

    public int getScore2() {
        return score2;
    }

    public int add(int a, int b) {
        score1 = a + b;
        return score1;
    }

    public int subtract(int a, int b) {
        score2 = a - b;
        return score2;
    }
}