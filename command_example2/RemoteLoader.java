package com.timurradko.command_example2;

import com.timurradko.command_example2.command.StereoOnWithCDCommand;
import com.timurradko.command_example2.entity.Stereo;

public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Stereo stereo = new Stereo();
        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
//        stereoOnWithCD.execute();
//        System.out.println(remoteControl);
        remoteControl.setCommand(0, stereoOnWithCD, stereoOnWithCD);
        remoteControl.onButtonWasPushed(0);

    }
}
