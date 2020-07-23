package com.timurradko.strategy_example2;

public class Knight extends Character {

    public Knight() {
        super(Knight.class.getSimpleName());
    }

    @Override
    void fight() {
        System.out.println(fightingScream(this.getName()));
    }
}
