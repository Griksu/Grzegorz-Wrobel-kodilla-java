package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskFactoryTestSuite {

    TaskFactory factory = new TaskFactory();

    @Test
    void testFactoryShoppingTask() {
        //Given
        //When
        Task shopping = factory.makeTask(TaskFactory.SHOPPING);
        //Then
        assertEquals("Grocery shopping", shopping.getTaskName());
        assertEquals(true, shopping.isTaskExecuted());
    }

    @Test
    void testFactoryPaintingTask() {
        //Given
        //When
        Task painting = factory.makeTask(TaskFactory.PAINTING);
        //Then
        assertEquals("Portrait", painting.getTaskName());
        assertEquals(false, painting.isTaskExecuted());
    }

    @Test
    void testFactoryDrivingTask() {
        //Given
        //When
        Task driving = factory.makeTask(TaskFactory.DRIVING);
        //Then
        assertEquals("Cargo", driving.getTaskName());
        assertEquals(true, driving.isTaskExecuted());
    }
}