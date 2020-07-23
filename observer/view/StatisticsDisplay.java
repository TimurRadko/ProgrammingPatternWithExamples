package com.timurradko.observer.view;

import com.timurradko.observer.DisplayElement;
import com.timurradko.observer.Observer;
import com.timurradko.observer.Subject;

import java.util.Locale;

public class StatisticsDisplay implements Observer, DisplayElement {
    private float maxTemp = 0.0f;
    private float minTemp = 200f;
    private float tempSum= 0.0f;
    private int numReadings;
    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registeredObserver(this);
    }

    @Override
    public void display() {
        System.out.println(String.format(Locale.UK,"Avg/Max/Min temperature = %.1f/%.1f/%.1f",
                (tempSum / numReadings), maxTemp, minTemp));
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        tempSum += temperature;
        numReadings++;

        if (temperature > maxTemp) {
            maxTemp = temperature;
        }

        if (temperature < minTemp) {
            minTemp = temperature;
        }

        display();
    }
}
