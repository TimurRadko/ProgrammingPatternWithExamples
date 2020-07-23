package com.timurradko.strategy_example1.behaviors.fly;

import com.timurradko.strategy_example1.behaviors.fly.FlyBehavior;

public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
