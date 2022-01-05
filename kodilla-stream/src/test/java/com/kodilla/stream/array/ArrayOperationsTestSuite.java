package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {
    
    @Test
    void testGetAverage() {
        //Given
        int[] numbers = new int[20];

        //When
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
        
        //Then
        assertEquals(57.5, ArrayOperations.getAverage(numbers));
    }
}
