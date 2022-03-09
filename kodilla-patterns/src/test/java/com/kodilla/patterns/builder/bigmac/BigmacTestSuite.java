package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BigmacTestSuite {

    @Test
    void testBigmacBuilder() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("Sesame seed")
                .burgers(2)
                .ingredients("Lettuce")
                .ingredients("Cheese")
                .ingredients("Pickles")
                .sauce("Standard sauce")
                .ingredients("Onion")
                .ingredients("Bacon")
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        double howManyBurgers = bigmac.getBurgers();
        boolean isOnionInBigmac = bigmac.getIngredients().contains("Onion");
        boolean isBunWithSesame = bigmac.getBun().contains("Sesame");

        //Then
        assertEquals(5, howManyIngredients);
        assertEquals(2, howManyBurgers);
        assertEquals(true, isOnionInBigmac);
        assertEquals(true, isBunWithSesame);
    }
}