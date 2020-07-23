package com.timurradko.factory_example2.pizza;

import com.timurradko.factory_example2.Pizza;
import com.timurradko.factory_example2.PizzaIngredientFactory;

public class PepperoniPizza extends Pizza {
    PizzaIngredientFactory pizzaIngredient;

    public PepperoniPizza(PizzaIngredientFactory pizzaIngredient) {
        this.pizzaIngredient = pizzaIngredient;
    }

    @Override
    protected void prepare() {
        System.out.println("Preparing " + getName());
        dough = pizzaIngredient.createDough();
        sauce = pizzaIngredient.createSauce();
        cheese = pizzaIngredient.createCheese();
        pepperoni = pizzaIngredient.createPepperoni();
    }
}
