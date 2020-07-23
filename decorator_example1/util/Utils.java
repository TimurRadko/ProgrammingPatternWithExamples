package com.timurradko.decorator_example1.util;

import com.timurradko.decorator_example1.beverage.Beverage;
import com.timurradko.decorator_example1.decorator.CondimentDecorator;

import java.util.Locale;

public class Utils {

    public static double getCostCalculation(Beverage beverage, CondimentDecorator decorator) {
        double cost = beverage.cost();
        String className = decorator.getClass().getSimpleName();
        DecoratorsPrize[] prizes = DecoratorsPrize.values();
        double decoratorCost = 0;
        for (DecoratorsPrize prize : prizes) {
            if (className.toLowerCase().equals(prize.name().toLowerCase())) {
                decoratorCost = prize.getCost();
                break;
            }
        }
        Beverage.Size size = beverage.getSize();
        if (size == Beverage.Size.TALL) {
            decoratorCost -= 0.05;
            cost += decoratorCost;
        } else if (size == Beverage.Size.GRANDE) {
            cost += decoratorCost;
        } else if (size == Beverage.Size.VENTI) {
            decoratorCost += 0.05;
            cost += decoratorCost;
        }
        return cost;
    }

    public static String getFullBeverageAndCost(Beverage beverage) {
        String description = beverage.getDescription();
        double cost = beverage.cost();
        return String.format(Locale.UK, "%s (size: %s): $ %.2f", description, beverage.getSize(), cost);
    }
}
