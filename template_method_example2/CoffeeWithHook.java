package com.timurradko.template_method_example2;

import com.timurradko.template_method_example2.utils.Utils;

public class CoffeeWithHook extends CaffeineBeverageWithHook {
    private static final String YES = "y";
    private static final String NO = "n";
    private static final String QUESTION = "Would you like milk and sugar with your coffee (y/n)?";

    @Override
    void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }

    @Override
    boolean customerWantsCondiments() {
        return Utils.getUserAnswer(QUESTION).equals(Utils.getYES());
    }
}
