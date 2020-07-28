package com.timurradko.adapter_example1;

public class DuckTestDrive {
    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();

        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("\nThe Turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nThe TurkeyAdapter says...");
        testDuck(duck);

        System.out.println("\nThe TurkeyAdapter says...");
        testDuck(turkeyAdapter);

        System.out.println("\nThe DuckAdapter says...");
        MallardDuck mallardDuck = new MallardDuck();
        Turkey duckAdapter = new DuckAdapter(mallardDuck);
        duckAdapter.fly();
        duckAdapter.gobble();
    }

    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
