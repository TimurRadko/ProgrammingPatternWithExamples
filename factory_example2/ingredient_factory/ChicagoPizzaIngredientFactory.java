package com.timurradko.factory_example2.ingredient_factory;

import com.timurradko.factory_example2.PizzaIngredientFactory;
import com.timurradko.factory_example2.ingredient.*;
import com.timurradko.factory_example2.ingredient.chicago_ingredient.MozzarellaCheese;
import com.timurradko.factory_example2.ingredient.chicago_ingredient.PlumTomatoSauce;
import com.timurradko.factory_example2.ingredient.chicago_ingredient.ThickCrustDough;
import com.timurradko.factory_example2.ingredient.ny_ingredient.FreshClams;
import com.timurradko.factory_example2.ingredient.ny_ingredient.SlicedPepperoni;
import com.timurradko.factory_example2.ingredient.veggies.BlackOlives;
import com.timurradko.factory_example2.ingredient.veggies.Eggplant;
import com.timurradko.factory_example2.ingredient.veggies.Mushroom;
import com.timurradko.factory_example2.ingredient.veggies.Spinach;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{new Spinach(), new BlackOlives(), new Eggplant(), new Mushroom()};
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
