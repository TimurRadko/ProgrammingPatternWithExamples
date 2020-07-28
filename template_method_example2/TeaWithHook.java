package com.timurradko.template_method_example2;

import com.timurradko.template_method_example2.utils.Utils;

public class TeaWithHook extends CaffeineBeverageWithHook {
    private static final String QUESTION = "Would you lemon with your tea (y/n)?";

    @Override
    void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Lemon");
    }

    @Override
    boolean customerWantsCondiments() {
        return Utils.getUserAnswer(QUESTION).equals(Utils.getYES());
    }
}
