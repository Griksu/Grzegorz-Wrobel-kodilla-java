package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TasksQueueTestSuite {

    @Test
    public void testUpdate() {
        //Given
        TasksQueue audreyTasks = new AudreyTasksQueue();
        TasksQueue johnTasks = new JohnTasksQueue();
        TasksQueue lucyTasks = new LucyTasksQueue();
        TasksQueue steveTasks = new SteveTasksQueue();
        Mentor andrewJohnson = new Mentor("Andrew Johnson");
        Mentor adrianSmith = new Mentor("Adrian Smith");
        audreyTasks.attachObserver(andrewJohnson);
        johnTasks.attachObserver(adrianSmith);
        lucyTasks.attachObserver(adrianSmith);
        steveTasks.attachObserver(andrewJohnson);
        //When
        audreyTasks.addTask(new Task("Design Pattern - Prototype", "Audrey"));
        johnTasks.addTask(new Task("Design Pattern - Strategy", "John"));
        lucyTasks.addTask(new Task("Design Pattern - Factory", "Lucy"));
        steveTasks.addTask(new Task("Design Pattern - Builder", "Steve"));
        johnTasks.addTask(new Task("Design Pattern - Facade", "John"));
        audreyTasks.addTask(new Task("Design Pattern - Decorator", "Audrey"));
        johnTasks.addTask(new Task("Design Pattern - Observer", "John"));
        //Then
        assertEquals(3, andrewJohnson.getTaskCount());
        assertEquals(4, adrianSmith.getTaskCount());
    }
}
