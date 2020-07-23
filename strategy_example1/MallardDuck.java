package com.timurradko.strategy_example1;

import com.timurradko.strategy_example1.behaviors.fly.FlyWithWings;
import com.timurradko.strategy_example1.behaviors.quack.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard Duck!");
    }
}
