package com.timurradko.command_example2.command.ceiling_fan;

import com.timurradko.command_example2.entity.CeilingFan;

public class UtilsForCeilingFanCommand {
    static void undoPreviousCommand(int prevSpeed, CeilingFan ceilingFan) {
        switch (prevSpeed) {
            case CeilingFan.HIGH:
                ceilingFan.high();
                break;
            case CeilingFan.MEDIUM:
                ceilingFan.medium();
                break;
            case CeilingFan.LOW:
                ceilingFan.low();
                break;
            case CeilingFan.OFF:
                ceilingFan.off();
                break;
        }
    }
}
