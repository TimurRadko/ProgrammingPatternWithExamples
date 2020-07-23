package com.timurradko.strategy_example2;

public class Queen extends Character {

    public Queen() {
        super(Queen.class.getSimpleName());
    }

    @Override
    void fight() {
        System.out.println(fightingScream(this.getName()));
    }
}
