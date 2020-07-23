package com.timurradko.command_example1.entity;

public class GarageDoor {

    public void up() {
        System.out.println("The garage door is open");
    }

    public void down() {
        System.out.println("The garage door is closed");
    }

    public void stop() {
        System.out.println("The garage door is stopped");
    }

    public void lightOn() {
        System.out.println("Into the garage the light on");
    }

    public void lightOff() {
        System.out.println("Into the garage the light off");
    }
}
