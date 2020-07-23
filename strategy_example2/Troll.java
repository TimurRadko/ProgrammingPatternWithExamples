package com.timurradko.strategy_example2;

public class Troll extends Character {

    public Troll() {
        super(Troll.class.getSimpleName());
    }

    @Override
    void fight() {
        System.out.println(fightingScream(this.getName()));
    }
}
