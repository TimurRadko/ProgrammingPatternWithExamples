package com.timurradko.command_example2.command.stereo;

import com.timurradko.command_example2.command.Command;
import com.timurradko.command_example2.entity.Stereo;

public class StereoOffWithCDCommand implements Command {
    private Stereo stereo;

    public StereoOffWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }

    @Override
    public void undo() {
        stereo.on();
        stereo.setCd();
        stereo.setVolume(11);
    }
}
