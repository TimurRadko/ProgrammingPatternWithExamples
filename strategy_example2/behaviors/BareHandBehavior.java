package com.timurradko.strategy_example2.behaviors;

public class BareHandBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.print("I won't kill you, because I don't have a Weapon.");
    }
}
