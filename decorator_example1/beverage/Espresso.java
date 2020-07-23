package com.timurradko.decorator_example1.beverage;

public class Espresso extends Beverage {
    private static final String ESPRESSO = "Espresso";

    public Espresso() {
        this.description = ESPRESSO;
    }

    public Espresso(Size size) {
        this();
        this.size = size;
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
