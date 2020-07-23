package com.timurradko.strategy_example1;

import com.timurradko.strategy_example1.behaviors.fly.FlyRockedPowered;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.performFly();
        mallardDuck.performQuack();

        Duck modelDuck = new ModelDuck();
        modelDuck.performFly();

        modelDuck.setFlyBehavior(new FlyRockedPowered());
        modelDuck.performFly();
    }
}
