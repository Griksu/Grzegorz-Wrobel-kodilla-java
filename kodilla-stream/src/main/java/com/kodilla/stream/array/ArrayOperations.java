package com.kodilla.stream.array;

import java.util.stream.IntStream;

public interface ArrayOperations {

    static double getAverage(int[] numbers) {

        IntStream numbersToAverage = IntStream.range(0, numbers.length);
        double average = numbersToAverage
                .map(n -> numbers[n])
                .average()
                .getAsDouble();
        return average;
    }
}
