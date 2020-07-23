package com.timurradko.observer.view;

import com.timurradko.observer.DisplayElement;
import com.timurradko.observer.Observer;
import com.timurradko.observer.Subject;

public class CurrentConditionDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registeredObserver(this);
    }

    @Override
    public void display() {
        System.out.println(String.format("Current conditions: %s F degrees and %s %% humidity.", temperature, humidity));
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
}
