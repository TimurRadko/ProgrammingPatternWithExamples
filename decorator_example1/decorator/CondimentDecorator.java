package com.timurradko.decorator_example1.decorator;

import com.timurradko.decorator_example1.beverage.Beverage;

public abstract class CondimentDecorator extends Beverage {
    public Beverage beverage;
    public abstract String getDescription();
}
