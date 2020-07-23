package com.timurradko.strategy_example2;

public class King extends Character {

    public King() {
        super(King.class.getSimpleName());
    }

    @Override
    void fight() {
        System.out.println(fightingScream(this.getName()));
    }
}
