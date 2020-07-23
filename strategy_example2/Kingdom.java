package com.timurradko.strategy_example2;

import com.timurradko.strategy_example2.behaviors.AxeBehavior;
import com.timurradko.strategy_example2.behaviors.BowAndArrowBehavior;
import com.timurradko.strategy_example2.behaviors.SwordBehavior;

public class Kingdom {
    public static void main(String[] args) {
        Character troll = new Troll();
        Character knight = new Knight();
        troll.fight();
        troll.performedToFight(new AxeBehavior());
        knight.fight();
        knight.performedToFight(new BowAndArrowBehavior());
        knight.setWeaponBehavior(new SwordBehavior());
    }
}
