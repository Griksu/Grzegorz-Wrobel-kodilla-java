package com.kodilla.patterns2.observer.homework;

public class Task {

    private String name;
    private String taskOwner;

    public Task(String name, String taskOwner) {
        this.name = name;
        this.taskOwner = taskOwner;
    }

    public String getName() {
        return name;
    }

    public String getTaskOwner() {
        return taskOwner;
    }
}
