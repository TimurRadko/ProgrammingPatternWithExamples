package com.timurradko.command_example2.command.ceiling_fan;

import com.timurradko.command_example2.command.Command;
import com.timurradko.command_example2.entity.CeilingFan;

public class CeilingFanLowCommand implements Command {
    private CeilingFan ceilingFan;
    private int prevSpeed;

    public CeilingFanLowCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.low();
    }

    @Override
    public void undo() {
        UtilsForCeilingFanCommand.undoPreviousCommand(prevSpeed, ceilingFan);
    }
}
