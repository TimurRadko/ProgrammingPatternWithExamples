package com.timurradko.strategy_example2.behaviors;

public class BowAndArrowBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("I'll kill you using the bow and arrows");
    }
}
