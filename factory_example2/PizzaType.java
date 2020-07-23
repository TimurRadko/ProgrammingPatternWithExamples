package com.timurradko.factory_example2;

public enum PizzaType {
    CHEESE("Cheese"), VEGGIE("Vegetarian"), CLAM("Clams"), PEPPERONI("Pepperoni");
    private String name;

    PizzaType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
