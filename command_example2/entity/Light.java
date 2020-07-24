package com.timurradko.command_example2.entity;

import com.timurradko.command_example2.RoomName;

public class Light {
    private RoomName roomName;

    public Light(RoomName roomName) {
        this.roomName = roomName;
    }

    public void on() {
        System.out.println(String.format("Light in %s is on!", roomName.getNameRoom().toLowerCase()));
    }

    public void off() {
        System.out.println(String.format("Light in %s is off!", roomName.getNameRoom().toLowerCase()));
    }
}
