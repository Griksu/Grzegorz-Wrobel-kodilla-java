package com.kodilla.exception.test;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class SecondChallengeTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @DisplayName("Test for: checking method with no exception")
    @Test
    void testProbablyIWillThrowExceptionNoException() {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();
        //When & Then
        assertDoesNotThrow(() ->
                secondChallenge.probablyIWillThrowException(1.5, 1.0));
    }

    @DisplayName("Test for: checking method with exception by illegal 'y'")
    @Test
    void testProbablyIWillThrowExceptionWithExceptionY() {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();
        //When & Then
        assertThrows(Exception.class, () ->
                secondChallenge.probablyIWillThrowException(1.5, 1.5));
    }

    @DisplayName("Test for: checking method with exception by illegal 'x'")
    @Test
    void testProbablyIWillThrowExceptionWithExceptionX() {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();
        //When & Then
        assertThrows(Exception.class, () ->
                secondChallenge.probablyIWillThrowException(3.0, 1.0));
    }

    @DisplayName("Test for: checking method with exception by illegal 'x' & 'y'")
    @Test
    void testProbablyIWillThrowExceptionWithExceptionXY() {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();
        //When & Then
        assertThrows(Exception.class, () ->
                secondChallenge.probablyIWillThrowException(0.5, 1.5));
    }
}