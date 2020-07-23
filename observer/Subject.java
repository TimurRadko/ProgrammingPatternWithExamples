package com.timurradko.observer;

public interface Subject {
    void registeredObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
