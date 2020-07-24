package com.timurradko.command_example2.entity;

import com.timurradko.command_example2.RoomName;

public class CeilingFan {
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    private RoomName roomName;
    private int speed;

    public CeilingFan(RoomName roomName) {
        this.roomName = roomName;
        this.speed = OFF;
    }

    public void high() {
        this.speed = HIGH;
        System.out.println(String.format("Ceiling Fan in %s is on %s!",
                roomName.getNameRoom().toLowerCase(), getSpeedName(speed)));
    }

    public void medium() {
        this.speed = MEDIUM;
        System.out.println(String.format("Ceiling Fan in %s is on %s!",
                roomName.getNameRoom().toLowerCase(), getSpeedName(speed)));
    }

    public void low() {
        this.speed = LOW;
        System.out.println(String.format("Ceiling Fan in %s is on %s!",
                roomName.getNameRoom().toLowerCase(), getSpeedName(speed)));
    }

    public void off() {
        this.speed = OFF;
        System.out.println(String.format("Ceiling Fan in %s is off!",
                roomName.getNameRoom().toLowerCase()));
    }

    public int getSpeed() {
        return speed;
    }

    private static String getSpeedName(int speed) {
        switch (speed) {
            case 3:
                return "high";
            case 2:
                return "medium";
            case 1:
                return "low";
        }
        return "off";
    }
}
