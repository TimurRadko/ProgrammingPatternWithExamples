package com.timurradko.command_example2;

import com.timurradko.command_example2.command.LightOffCommand;
import com.timurradko.command_example2.command.LightOnCommand;
import com.timurradko.command_example2.command.StereoOffWithCDCommand;
import com.timurradko.command_example2.command.StereoOnWithCDCommand;
import com.timurradko.command_example2.entity.Light;
import com.timurradko.command_example2.entity.Stereo;

public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Stereo stereo = new Stereo(RoomName.LIVING_ROOM);
        Light kitchenLight = new Light(RoomName.KITCHEN);
        Light livingRoomLight = new Light(RoomName.LIVING_ROOM);

        LightOnCommand lightOnKitchen = new LightOnCommand(kitchenLight);
        LightOffCommand lightOffKitchen = new LightOffCommand(kitchenLight);
        LightOnCommand lightOnLivingRoom = new LightOnCommand(livingRoomLight);
        LightOffCommand lightOffLivingRoom = new LightOffCommand(kitchenLight);

        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        StereoOffWithCDCommand stereoOffWithCD = new StereoOffWithCDCommand(stereo);

        remoteControl.setCommand(0, stereoOnWithCD, stereoOffWithCD);
        remoteControl.setCommand(1, lightOnKitchen, lightOffKitchen);
        remoteControl.setCommand(2, lightOnLivingRoom, lightOffLivingRoom);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);

    }
}
