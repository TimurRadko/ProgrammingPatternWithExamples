package com.timurradko.command_example1.command;

import com.timurradko.command_example1.entity.GarageDoor;

public class DoorOpenCommand implements Command {
    GarageDoor garageDoor;

    public DoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }
}
