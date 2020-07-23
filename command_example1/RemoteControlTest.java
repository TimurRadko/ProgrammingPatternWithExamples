package com.timurradko.command_example1;

import com.timurradko.command_example1.command.DoorOpenCommand;
import com.timurradko.command_example1.command.LightOnCommand;
import com.timurradko.command_example1.entity.GarageDoor;
import com.timurradko.command_example1.entity.Light;

public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);

        remote.setCommand(lightOn);
        remote.buttonWasPressed();

        GarageDoor garageDoor = new GarageDoor();
        DoorOpenCommand openDoor = new DoorOpenCommand(garageDoor);

        remote.setCommand(openDoor);
        remote.buttonWasPressed();
    }
}
