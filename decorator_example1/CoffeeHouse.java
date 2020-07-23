package com.timurradko.decorator_example1;

import com.timurradko.decorator_example1.beverage.Beverage;
import com.timurradko.decorator_example1.beverage.DarkRoast;
import com.timurradko.decorator_example1.beverage.Espresso;
import com.timurradko.decorator_example1.beverage.HouseBlend;
import com.timurradko.decorator_example1.decorator.Mocha;
import com.timurradko.decorator_example1.decorator.Soy;
import com.timurradko.decorator_example1.decorator.Whip;
import com.timurradko.decorator_example1.util.Utils;

public class CoffeeHouse {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(Utils.getFullBeverageAndCost(beverage));

        Beverage beverage2 = new DarkRoast(Beverage.Size.GRANDE);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(Utils.getFullBeverageAndCost(beverage2));

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(Utils.getFullBeverageAndCost(beverage3));

        Beverage beverage4 = new Espresso();
        beverage4 = new Soy(beverage4);
        System.out.println(Utils.getFullBeverageAndCost(beverage4));
    }
}
