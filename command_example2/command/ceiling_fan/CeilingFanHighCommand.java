package com.timurradko.command_example2.command.ceiling_fan;

import com.timurradko.command_example2.command.Command;
import com.timurradko.command_example2.entity.CeilingFan;

public class CeilingFanHighCommand implements Command {
    private CeilingFan ceilingFan;
    private int prevSpeed;

    public CeilingFanHighCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.high();
    }

    @Override
    public void undo() {
        UtilsForCeilingFanCommand.undoPreviousCommand(prevSpeed, ceilingFan);
    }
}
