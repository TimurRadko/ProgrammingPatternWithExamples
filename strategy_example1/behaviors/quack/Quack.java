package com.timurradko.strategy_example1.behaviors.quack;

public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("I'm quacking");
    }
}
