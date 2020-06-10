package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
        //Test Calculator
        System.out.println("Test Calculator");
        Calculator calculator1 = new Calculator();
        calculator1.add(6, 8);
        //System.out.println("The score is: " + calculator1.getScore1());
        if (calculator1.getScore1() == 14) {
            System.out.println("Adding test OK");
        } else {
            System.out.println("Error");
        }
        Calculator calculator2 = new Calculator();
        calculator2.subtract(180, 18000);
        //System.out.println("The score is: " + calculator2.getScore2());
        if (calculator2.getScore2() == -17820) {
            System.out.println("Subtract test OK");
        } else {
            System.out.println("Error");
        }
    }
}