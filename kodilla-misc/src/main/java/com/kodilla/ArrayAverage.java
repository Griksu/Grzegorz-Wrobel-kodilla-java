package com.kodilla;

public class ArrayAverage {
    public static void main(String[] args) throws java.lang.Exception {

        int[] numbers = new int[20];
        numbers[0] = 10;
        numbers[1] = 15;
        numbers[2] = 20;
        numbers[3] = 25;
        numbers[4] = 30;
        numbers[5] = 35;
        numbers[6] = 40;
        numbers[7] = 45;
        numbers[8] = 50;
        numbers[9] = 55;
        numbers[10] = 60;
        numbers[11] = 65;
        numbers[12] = 70;
        numbers[13] = 75;
        numbers[14] = 80;
        numbers[15] = 85;
        numbers[16] = 90;
        numbers[17] = 95;
        numbers[18] = 100;
        numbers[19] = 105;
        int length = numbers.length;
        double total = 0;

        for (int i=0; i<20; i++) {
            System.out.println("Array numbers[" + i + "] = " + numbers[i]);
            total = total + numbers[i];
        }

        double average = total / length;

        System.out.println("The average is: " + average);
        System.out.println(length);
    }
}
