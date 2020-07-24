package com.timurradko.command_example2.command.light;

import com.timurradko.command_example2.command.Command;
import com.timurradko.command_example2.entity.Light;

public class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
