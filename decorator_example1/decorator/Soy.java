package com.timurradko.decorator_example1.decorator;

import com.timurradko.decorator_example1.beverage.Beverage;
import com.timurradko.decorator_example1.util.Utils;

public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
        this.size = beverage.getSize();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return Utils.getCostCalculation(beverage, this);
    }
}
