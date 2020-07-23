package com.timurradko.strategy_example1.behaviors.quack;

public class Squeak implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("I'm squeaking");
    }
}
