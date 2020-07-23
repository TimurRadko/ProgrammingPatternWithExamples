package com.timurradko.factory_example2.pizza;

import com.timurradko.factory_example2.Pizza;
import com.timurradko.factory_example2.PizzaIngredientFactory;

public class ClamPizza extends Pizza {
    PizzaIngredientFactory pizzaIngredient;

    public ClamPizza(PizzaIngredientFactory pizzaIngredient) {
        this.pizzaIngredient = pizzaIngredient;
    }

    @Override
    protected void prepare() {
        System.out.println("Preparing " + getName());
        dough = pizzaIngredient.createDough();
        sauce = pizzaIngredient.createSauce();
        cheese = pizzaIngredient.createCheese();
        clam = pizzaIngredient.createClam();
    }
}
