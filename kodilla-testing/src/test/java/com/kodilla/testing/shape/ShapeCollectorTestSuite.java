package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

@DisplayName("TDD: Shape Collector Test Suite")
public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }
    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }
    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Nested
    @DisplayName("Tests for squares")
    class TestSquares {
        @Test
        void testAddFigures() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Square(5);
            //When
            shapeCollector.addFigure(shape);;
            //Then
            Assertions.assertEquals(1, shapeCollector.getShapeList().size());
        }
        @Test
        void testRemoveFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Square(5);
            shapeCollector.addFigure(shape);
            //When
            boolean result = shapeCollector.removeFigure(shape);
            //Then
            Assertions.assertTrue(result);
            Assertions.assertEquals(0, shapeCollector.getShapeList().size());
        }
        @Test
        void testGetFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Square(5);
            shapeCollector.addFigure(shape);
            //When
            Shape retrievedShape;
            retrievedShape = shapeCollector.getFigure(0);
            //Then
            Assertions.assertEquals(shape, retrievedShape);
        }
        @Test
        void testShowFigures() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Square(5);
            shapeCollector.addFigure(shape);
            //When
            List<Shape> tempList = new ArrayList<>();
            tempList.add(shape);
            List<Shape> shapeList = shapeCollector.getShapeList();
            //Then
            Assertions.assertEquals(tempList.toString(), shapeList.toString());
        }
    }
}
