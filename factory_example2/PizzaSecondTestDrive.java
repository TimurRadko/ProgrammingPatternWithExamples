package com.timurradko.factory_example2;

import com.timurradko.factory_example2.pizza_store.ChicagoPizzaStore;
import com.timurradko.factory_example2.pizza_store.NYPizzaStore;

public class PizzaSecondTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza(PizzaType.CHEESE);
        System.out.println("Ethan ordered a " + pizza + "\n");

        pizza = chicagoStore.orderPizza(PizzaType.CHEESE);
        System.out.println("Joel ordered a " + pizza + "\n");

        pizza = nyStore.orderPizza(PizzaType.CLAM);
        System.out.println("Ethan ordered a " + pizza + "\n");

        pizza = chicagoStore.orderPizza(PizzaType.CLAM);
        System.out.println("Joel ordered a " + pizza + "\n");

        pizza = nyStore.orderPizza(PizzaType.PEPPERONI);
        System.out.println("Ethan ordered a " + pizza + "\n");

        pizza = chicagoStore.orderPizza(PizzaType.PEPPERONI);
        System.out.println("Joel ordered a " + pizza + "\n");

        pizza = nyStore.orderPizza(PizzaType.VEGGIE);
        System.out.println("Ethan ordered a " + pizza + "\n");

        pizza = chicagoStore.orderPizza(PizzaType.VEGGIE);
        System.out.println("Joel ordered a " + pizza + "\n");
    }
}
