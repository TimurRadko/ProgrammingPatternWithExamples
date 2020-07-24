package com.timurradko.command_example2.command.light;

import com.timurradko.command_example2.command.Command;
import com.timurradko.command_example2.entity.Light;

public class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
