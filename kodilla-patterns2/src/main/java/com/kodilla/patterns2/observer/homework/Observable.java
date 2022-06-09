package com.kodilla.patterns2.observer.homework;

public interface Observable {
    void attachObserver(Observer observer);
    void notifyObservers();
    void detachObserver(Observer observer);
}
