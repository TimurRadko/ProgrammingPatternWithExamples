package com.timurradko.factory_example2.pizza_store;

import com.timurradko.factory_example2.Pizza;
import com.timurradko.factory_example2.PizzaIngredientFactory;
import com.timurradko.factory_example2.PizzaStore;
import com.timurradko.factory_example2.PizzaType;
import com.timurradko.factory_example2.ingredient_factory.ChicagoPizzaIngredientFactory;
import com.timurradko.factory_example2.pizza.CheesePizza;
import com.timurradko.factory_example2.pizza.ClamPizza;
import com.timurradko.factory_example2.pizza.PepperoniPizza;
import com.timurradko.factory_example2.pizza.VeggiePizza;

public class ChicagoPizzaStore extends PizzaStore {
    private static final String DESCRIPTION = "Chicago Style %s Pizza";
    private static final String DESCRIPTION_CLAM_PIZZA = "Chicago Style Pizza with %s";

    @Override
    protected Pizza createPizza(PizzaType type) {
        Pizza pizza = null;
        PizzaIngredientFactory pizzaIngredient = new ChicagoPizzaIngredientFactory();

        switch (type) {
            case CHEESE:
                pizza = new CheesePizza(pizzaIngredient);
                pizza.setName(String.format(DESCRIPTION, type.getName()));
                break;
            case VEGGIE:
                pizza = new VeggiePizza(pizzaIngredient);
                pizza.setName(String.format(DESCRIPTION, type.getName()));
                break;
            case CLAM:
                pizza = new ClamPizza(pizzaIngredient);
                pizza.setName(String.format(DESCRIPTION_CLAM_PIZZA, type.getName()));
                break;
            case PEPPERONI:
                pizza = new PepperoniPizza(pizzaIngredient);
                pizza.setName(String.format(DESCRIPTION, type.getName()));
                break;
            default:
                return null;
        }
        return pizza;
    }

}
