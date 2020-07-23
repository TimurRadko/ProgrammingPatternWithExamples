package com.timurradko.factory_example1;

import com.timurradko.factory_example1.chicago_pizza_store.ChicagoPizzaStore;
import com.timurradko.factory_example1.ny_pizza_store.NYPizzaStore;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza(PizzaType.CHEESE);
        System.out.println(String.format("Ethan ordered a %s \n", pizza.getName()));

        pizza = chicagoStore.orderPizza(PizzaType.CHEESE);
        System.out.println(String.format("Joel ordered a %s \n", pizza.getName()));
    }
}
