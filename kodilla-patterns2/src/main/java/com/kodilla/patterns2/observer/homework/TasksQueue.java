package com.kodilla.patterns2.observer.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class TasksQueue implements Observable {

    private final List<Observer> observers;
    private final Deque<Task> tasks;
    private final String name;

    public TasksQueue(String name) {
        observers = new ArrayList<>();
        tasks = new ArrayDeque<>();
        this.name = name;
    }

    public void addTask(Task task) {
        tasks.offer(task);
        notifyObservers();
    }

    @Override
    public void attachObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public void detachObserver(Observer observer) {
        observers.remove(observer);
    }

    public Deque<Task> getTasks() {
        return tasks;
    }

    public String getName() {
        return name;
    }
}
