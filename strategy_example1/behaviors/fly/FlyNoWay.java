package com.timurradko.strategy_example1.behaviors.fly;

import com.timurradko.strategy_example1.behaviors.fly.FlyBehavior;

public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
