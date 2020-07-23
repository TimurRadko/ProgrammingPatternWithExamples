package com.timurradko.strategy_example1.behaviors.fly;

public class FlyRockedPowered implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket");
    }
}
