package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LoggerTestSuite {

    private static Logger logger;

    @Test
    void testGetLastLog () {
        //Given
        logger = Logger.INSTANCE;
        logger.log("Process finished with no errors");
        //When
        String lastLog = logger.getLastLog();
        System.out.println("Last log: " + lastLog);
        //Then
        assertEquals("Process finished with no errors", lastLog);

    }

}
