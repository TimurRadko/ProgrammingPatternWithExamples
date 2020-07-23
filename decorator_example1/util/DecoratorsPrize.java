package com.timurradko.decorator_example1.util;

public enum DecoratorsPrize {
    MILK(.10), MOCHA(.20), SOY(.15), WHIP(.10);
    private double cost;

    DecoratorsPrize(double cost) {
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }
}
