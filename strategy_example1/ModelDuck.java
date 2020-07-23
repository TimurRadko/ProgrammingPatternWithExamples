package com.timurradko.strategy_example1;

import com.timurradko.strategy_example1.behaviors.fly.FlyNoWay;
import com.timurradko.strategy_example1.behaviors.quack.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
