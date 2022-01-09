package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            String result = secondChallenge.probablyIWillThrowException(2.5, 1.5);
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Something went wrong! Error: " + e);
        } finally {
            System.out.println("Finish!!");
        }
    }
}