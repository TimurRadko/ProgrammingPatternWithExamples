package com.timurradko.template_method_example2;

public class BeverageTestDrive {
    public static void main(String[] args) {
        CoffeeWithHook coffee = new CoffeeWithHook();
        TeaWithHook tea = new TeaWithHook();

        System.out.println("\nPrepare coffee...");
        coffee.prepareRecipe();

        System.out.println("\nPrepare tea...");
        tea.prepareRecipe();
    }
}
