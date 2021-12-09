package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;
import java.util.ArrayList;
import java.util.List;

@DisplayName("Collection Test Suite")
public class CollectionTestSuite {
    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test Suit: begin");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Test Suit: end");
    }

    @DisplayName("When created empty list")

    @Test
    void testOddNumbersExterminatorEmptyList() {
        //Given
        List<Integer> emptyList = new ArrayList<>();
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> resultEmptyList = oddNumbersExterminator.exterminate(emptyList);
        //When
        List<Integer> result = oddNumbersExterminator.getListOfNumbers();
        //Then
        Assertions.assertEquals(resultEmptyList, result);
    }

    @DisplayName("When created normal list of numbers (not empty)")

    @Test
    void testOddNumbersExterminatorNormalList() {
        //Given
        List<Integer> normalList = new ArrayList<>();
        normalList.add(1);
        normalList.add(2);
        normalList.add(3);
        normalList.add(4);
        normalList.add(5);
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> resultNormalList = oddNumbersExterminator.exterminate(normalList);
        //When
        List<Integer> expectedResultList = new ArrayList<>();
        expectedResultList.add(2);
        expectedResultList.add(4);
        //Then
        Assertions.assertEquals(expectedResultList, resultNormalList);
    }
}