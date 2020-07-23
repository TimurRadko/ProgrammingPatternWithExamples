package com.timurradko.factory_example2.ingredient_factory;

import com.timurradko.factory_example2.PizzaIngredientFactory;
import com.timurradko.factory_example2.ingredient.*;
import com.timurradko.factory_example2.ingredient.ny_ingredient.*;
import com.timurradko.factory_example2.ingredient.veggies.Garlic;
import com.timurradko.factory_example2.ingredient.veggies.Mushroom;
import com.timurradko.factory_example2.ingredient.veggies.Onion;
import com.timurradko.factory_example2.ingredient.veggies.RedPepper;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }
}
