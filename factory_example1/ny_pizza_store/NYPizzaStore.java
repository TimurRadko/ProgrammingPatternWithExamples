package com.timurradko.factory_example1.ny_pizza_store;

import com.timurradko.factory_example1.Pizza;
import com.timurradko.factory_example1.PizzaStore;
import com.timurradko.factory_example1.PizzaType;

public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(PizzaType type) {
        switch (type) {
            case CHEESE:
                return new NYStyleCheesePizza();
            case VEGGIE:
                return new NYStyleVeggiePizza();
            case CLAM:
                return new NYStyleClamPizza();
            case PEPPERONI:
                return new NYStylePepperoniPizza();
            default:
                return null;
        }
    }
}
