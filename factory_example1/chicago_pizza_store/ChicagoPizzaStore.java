package com.timurradko.factory_example1.chicago_pizza_store;

import com.timurradko.factory_example1.Pizza;
import com.timurradko.factory_example1.PizzaStore;
import com.timurradko.factory_example1.PizzaType;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(PizzaType type) {
        switch (type) {
            case CHEESE:
                return new ChicagoStyleCheesePizza();
            case VEGGIE:
                return new ChicagoStyleVeggiePizza();
            case CLAM:
                return new ChicagoStyleClamPizza();
            case PEPPERONI:
                return new ChicagoStylePepperoniPizza();
            default:
                return null;
        }
    }
}
