package com.timurradko.strategy_example2;

import com.timurradko.strategy_example2.behaviors.BareHandBehavior;
import com.timurradko.strategy_example2.behaviors.WeaponBehavior;

public abstract class Character {
    WeaponBehavior weaponBehavior;
    private String name;

    public Character(String name) {
        this.name = name;
        this.weaponBehavior = new BareHandBehavior();
    }

    abstract void fight();

    public void performedToFight(WeaponBehavior weaponBehavior) {
        weaponBehavior.useWeapon();
    }

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }

    public WeaponBehavior getWeaponBehavior() {
        return weaponBehavior;
    }

    String fightingScream(String name) {
        if (getWeaponBehavior() instanceof BareHandBehavior) {
            getWeaponBehavior().useWeapon();
            return String.format(" I'm a %s", name);
        } else {
            return String.format("I'm fighting as a %s.", name);
        }
    }

    public String getName() {
        return name;
    }
}
