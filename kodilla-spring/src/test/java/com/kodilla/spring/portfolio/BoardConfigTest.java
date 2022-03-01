package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BoardConfigTest {

    @Autowired
    private Board board;

    @Test
    void testTaskAdd() {
        //Given
        board.getToDoList().addTask("task1");
        board.getInProgressList().addTask("task2");
        board.getDoneList().addTask("task3");

        //When
        String result1 = board.getToDoList().getTasks().get(0);
        String result2 = board.getInProgressList().getTasks().get(0);
        String result3 = board.getDoneList().getTasks().get(0);

        //Then
        assertEquals("task1", result1);
        assertEquals("task2", result2);
        assertEquals("task3", result3);
    }
}