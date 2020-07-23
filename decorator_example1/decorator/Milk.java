package com.timurradko.decorator_example1.decorator;

import com.timurradko.decorator_example1.beverage.Beverage;
import com.timurradko.decorator_example1.util.Utils;

public class Milk extends CondimentDecorator {
    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
        this.size = beverage.getSize();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    @Override
    public double cost() {
        return Utils.getCostCalculation(beverage, this);
    }
}
