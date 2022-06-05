package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.*;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("TDD: Pizza Order With Decorator Pattern Test Suite")
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class PizzaOrderTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests" + "\n");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished");
    }

    @BeforeEach
    public void beforeEachTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }
    @AfterEach
    public void afterEachTest() {
        System.out.println("");
    }

    @DisplayName("Test for: returning cost of Basic Pizza")
    @Test
    @Order(1)
    public void testBasicPizzaOrderGetCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        //When
        BigDecimal theCost = pizzaOrder.getCost();
        System.out.println("Cost of pizza: " + pizzaOrder.getCost() + " zł");
        //Then
        assertEquals(new BigDecimal(15), theCost);
    }

    @DisplayName("Test for: returning description of Basic Pizza")
    @Test
    @Order(2)
    public void testBasicPizzaOrderGetDescription() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        System.out.println("The order: " + pizzaOrder.getDescription());
        //When
        String description = pizzaOrder.getDescription();
        //Then
        assertEquals("Pizza with tomato sauce and fresh mozzarella", description);
    }

    @DisplayName("Test for: returning cost of Pizza Margherita with Onion")
    @Test
    @Order(3)
    public void testPizzaMargheritaWithOnionGetCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new PizzaMargheritaDecorator(pizzaOrder);
        pizzaOrder = new PizzaIngredientOlivesDecorator(pizzaOrder);
        System.out.println("Cost of pizza: " + pizzaOrder.getCost() + " zł");
        //When
        BigDecimal theCost = pizzaOrder.getCost();
        //Then
        assertEquals(new BigDecimal(24), theCost);
    }

    @DisplayName("Test for: returning description of Pizza Margherita with Onion")
    @Test
    @Order(4)
    public void testPizzaMargheritaWithOnionGetDescription() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new PizzaMargheritaDecorator(pizzaOrder);
        pizzaOrder = new PizzaIngredientOlivesDecorator(pizzaOrder);
        System.out.println("The order: " + pizzaOrder.getDescription());
        //When
        String description = pizzaOrder.getDescription();
        //Then
        assertEquals("Pizza with tomato sauce and fresh mozzarella" +
                " with basil + olives", description);
    }

    @DisplayName("Test for: returning cost of Pizza Capricciosa " +
            "with Onion and Garlic Sauce")
    @Test
    @Order(5)
    public void testPizzaCapricciosaWithOnionAndGarlicSauceGetCost() {
        //Give
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new PizzaCapricciosaDecorator(pizzaOrder);
        pizzaOrder = new PizzaIngredientOnionDecorator(pizzaOrder);
        pizzaOrder = new PizzaSauceGarlicDecorator(pizzaOrder);
        System.out.println("Cost of pizza: " + pizzaOrder.getCost() + " zł");
        //When
        BigDecimal theCost = pizzaOrder.getCost();
        //Then
        assertEquals(new BigDecimal(29), theCost);
    }

    @DisplayName("Test for: returning description of Pizza Capricciosa " +
            "with Onion and Garlic Sauce")
    @Test
    @Order(6)
    public void testPizzaCapricciosaWithOnionAndGarlicSauceGetDescription() {
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new PizzaCapricciosaDecorator(pizzaOrder);
        pizzaOrder = new PizzaIngredientOnionDecorator(pizzaOrder);
        pizzaOrder = new PizzaSauceGarlicDecorator(pizzaOrder);
        System.out.println("The order: " + pizzaOrder.getDescription());
        //When
        String description = pizzaOrder.getDescription();
        //Then
        assertEquals("Pizza with tomato sauce and fresh mozzarella" +
                " with ham, mushrooms, olives + onion + garlic sauce", description);
    }

    @DisplayName("Test for: returning cost of Pizza Vegana " +
            "with mushrooms and Garlic Sauce")
    @Test
    @Order(7)
    public void testPizzaVeganaWithMushroomsAndGarlicSauceGetCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new PizzaVeganaDecorator(pizzaOrder);
        pizzaOrder = new PizzaIngredientMushroomsDecorator(pizzaOrder);
        pizzaOrder = new PizzaSauceGarlicDecorator(pizzaOrder);
        System.out.println("Cost of pizza: " + pizzaOrder.getCost() + " zł");
        //When
        BigDecimal theCost = pizzaOrder.getCost();
        //Then
        assertEquals(new BigDecimal(23), theCost);
    }

    @DisplayName("Test for: returning description of Pizza Vegana " +
            "with mushrooms and Garlic Sauce")
    @Test
    @Order(8)
    public void testPizzaVeganaWithMushroomsAndGarlicSauceGetDescription() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new PizzaVeganaDecorator(pizzaOrder);
        pizzaOrder = new PizzaIngredientMushroomsDecorator(pizzaOrder);
        pizzaOrder = new PizzaSauceGarlicDecorator(pizzaOrder);
        System.out.println("The order: " + pizzaOrder.getDescription());
        //When
        String description = pizzaOrder.getDescription();
        //Then
        assertEquals("Pizza with tomato sauce and fresh mozzarella" +
                " with oregano + mushrooms + garlic sauce", description);
    }
}
