package com.timurradko.decorator_example1.beverage;

public class HouseBlend extends Beverage {
    private static final String HOUSE_BLEND = "House Blend";

    public HouseBlend() {
        this.description = HOUSE_BLEND;
    }

    public HouseBlend(Size size) {
        this();
        this.size = size;
    }

    @Override
    public double cost() {
        return .89;
    }
}
