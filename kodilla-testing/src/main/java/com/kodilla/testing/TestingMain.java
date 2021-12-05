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

        System.out.println("Test - pierwszy test jednostkowy:");

        Calculator calculator = new Calculator(30, 10);

        int resultA = calculator.getA();
        int resultB = calculator.getB();

        int resultAdd = calculator.add(resultA, resultB);
        int resultSubtr = calculator.subtract(resultA, resultB);

        if(resultAdd == calculator.add(30, 10)) {
            System.out.println("addition test OK");
        } else {
            System.out.println("addition test ERROR!");
        }

        if(resultSubtr == calculator.subtract(30, 10)) {
            System.out.println("subtraction test OK");
        } else {
            System.out.println("subtraction test ERROR!");
        }
    }
}
