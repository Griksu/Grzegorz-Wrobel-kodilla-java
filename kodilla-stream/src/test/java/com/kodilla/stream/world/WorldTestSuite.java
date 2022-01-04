package com.kodilla.stream.world;

import org.junit.jupiter.api.*;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("TDD: World Population Calculation Test Suite")
public class WorldTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of test");
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

    @DisplayName("Test for: People quantity calculation")
    @Test
    void testGetPeopleQuantity() {
        //Given
        World world = new World();
        Continent europe = new Continent("Europe");
        Continent asia = new Continent("Asia");
        Continent northAmerica = new Continent("North America");

        Country poland = new Country("Poland", new BigDecimal("38000000"));
        Country france = new Country("France", new BigDecimal("65000000"));
        Country germany = new Country("Germany",new BigDecimal("84000000"));
        Country india = new Country("India", new BigDecimal("1300000000"));
        Country china = new Country("China", new BigDecimal("1400000000"));
        Country usa = new Country("USA", new BigDecimal("320000000"));
        Country mexico = new Country("Mexico", new BigDecimal("130000000"));

        world.addContinent(europe);
        world.addContinent(asia);
        world.addContinent(northAmerica);
        europe.addCountry(poland);
        europe.addCountry(france);
        europe.addCountry(germany);
        asia.addCountry(india);
        asia.addCountry(china);
        northAmerica.addCountry(usa);
        northAmerica.addCountry(mexico);

        //When
        BigDecimal expectedPeopleQuantity = new BigDecimal("3337000000");
        //Then
        assertEquals(expectedPeopleQuantity, world.getPeopleQuantity());
    }
}
