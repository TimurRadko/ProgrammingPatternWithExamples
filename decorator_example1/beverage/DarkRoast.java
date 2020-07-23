package com.timurradko.decorator_example1.beverage;

public class DarkRoast extends Beverage {
    private static final String DARK_ROAST = "Dark Roast";

    public DarkRoast() {
        this.description = DARK_ROAST;
    }

    public DarkRoast(Size size) {
        this();
        this.size = size;
    }

    @Override
    public double cost() {
        return .99;
    }
}
