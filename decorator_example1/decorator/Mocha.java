package com.timurradko.decorator_example1.decorator;

import com.timurradko.decorator_example1.beverage.Beverage;
import com.timurradko.decorator_example1.util.Utils;

public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
        this.size = beverage.getSize();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return Utils.getCostCalculation(beverage, this);
    }
}
