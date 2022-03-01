package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Test
    void testAddition() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double val = calculator.add(4.5, 2.0);
        //Then
        assertEquals(6.5, val);
    }

    @Test
    void testSubtraction() {
        //Given
        //When
        double val = calculator.sub(7, 2);
        //Then
        assertEquals(5, val);
    }

    @Test
    void testMultiplication() {
        //Given
        //When
        double val = calculator.mul(7, 2);
        //Then
        assertEquals(14, val);
    }

    @Test
    void testDivision() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double val = calculator.div(10, 2);
        //Then
        assertEquals(5, val);
    }
}