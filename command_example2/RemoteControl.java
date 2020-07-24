package com.timurradko.command_example2;

import com.timurradko.command_example2.command.Command;
import com.timurradko.command_example2.command.NoCommand;

public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();

        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n     ----- Remote Control -----      \n")
                .append("     --------------------------      \n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuffer.append("[slot ")
                    .append(i)
                    .append("] ")
                    .append(String.format("%24s", onCommands[i].getClass().getSimpleName()))
                    .append("    ")
                    .append(String.format("%24s", offCommands[i].getClass().getSimpleName()))
                    .append("\n");
        }
        return stringBuffer.toString();
    }
}
