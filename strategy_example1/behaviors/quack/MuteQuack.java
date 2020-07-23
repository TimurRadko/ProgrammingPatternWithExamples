package com.timurradko.strategy_example1.behaviors.quack;

public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("...");
    }
}
