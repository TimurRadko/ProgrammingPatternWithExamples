package com.timurradko.command_example2;

import com.timurradko.command_example2.command.ceiling_fan.CeilingFanHighCommand;
import com.timurradko.command_example2.command.ceiling_fan.CeilingFanLowCommand;
import com.timurradko.command_example2.command.ceiling_fan.CeilingFanMediumCommand;
import com.timurradko.command_example2.command.ceiling_fan.CeilingFanOffCommand;
import com.timurradko.command_example2.command.light.LightOffCommand;
import com.timurradko.command_example2.command.light.LightOnCommand;
import com.timurradko.command_example2.command.stereo.StereoOffWithCDCommand;
import com.timurradko.command_example2.command.stereo.StereoOnWithCDCommand;
import com.timurradko.command_example2.entity.CeilingFan;
import com.timurradko.command_example2.entity.Light;
import com.timurradko.command_example2.entity.Stereo;

public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

        Stereo stereo = new Stereo(RoomName.LIVING_ROOM);
        Light kitchenLight = new Light(RoomName.KITCHEN);
        Light livingRoomLight = new Light(RoomName.LIVING_ROOM);
        CeilingFan livingRoomCeilingFan = new CeilingFan(RoomName.LIVING_ROOM);

        LightOnCommand lightOnKitchen = new LightOnCommand(kitchenLight);
        LightOffCommand lightOffKitchen = new LightOffCommand(kitchenLight);
        LightOnCommand lightOnLivingRoom = new LightOnCommand(livingRoomLight);
        LightOffCommand lightOffLivingRoom = new LightOffCommand(kitchenLight);

        CeilingFanMediumCommand mediumCommand = new CeilingFanMediumCommand(livingRoomCeilingFan);
        CeilingFanHighCommand highCommand = new CeilingFanHighCommand(livingRoomCeilingFan);
        CeilingFanLowCommand lowCommand = new CeilingFanLowCommand(livingRoomCeilingFan);
        CeilingFanOffCommand offCommand = new CeilingFanOffCommand(livingRoomCeilingFan);

        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        StereoOffWithCDCommand stereoOffWithCD = new StereoOffWithCDCommand(stereo);

        remoteControl.setCommand(0, stereoOnWithCD, stereoOffWithCD);
        remoteControl.setCommand(1, lightOnKitchen, lightOffKitchen);
        remoteControl.setCommand(2, lightOnLivingRoom, lightOffLivingRoom);
        remoteControl.setCommand(3, mediumCommand, offCommand);
        remoteControl.setCommand(4, highCommand, offCommand);
        remoteControl.setCommand(5, lowCommand, offCommand);

        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
        remoteControl.onButtonWasPushed(4);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
        System.out.println(remoteControl);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);

        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
    }
}
