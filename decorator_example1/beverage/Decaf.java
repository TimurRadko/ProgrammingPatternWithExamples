package com.timurradko.decorator_example1.beverage;

public class Decaf extends Beverage {
    private static final String DECAF = "Without caffeine";

    public Decaf() {
        this.description = DECAF;
    }

    public Decaf(Size size) {
        this();
        this.size = size;
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
