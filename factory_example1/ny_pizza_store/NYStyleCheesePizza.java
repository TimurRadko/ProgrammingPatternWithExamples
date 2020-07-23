package com.timurradko.factory_example1.ny_pizza_store;

import com.timurradko.factory_example1.Pizza;

public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza() {
        name = "NY Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grand Reggiano Cheese");
    }

}
