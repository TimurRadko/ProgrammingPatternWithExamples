package com.timurradko.command_example2;

import com.timurradko.command_example2.command.Command;
import com.timurradko.command_example2.command.NoCommand;

public class RemoteControlWithUndo {
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    public RemoteControlWithUndo() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();

        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPushed() {
        undoCommand.undo();
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
        stringBuffer.append("[undo] ").append(String.format("%24s", undoCommand.getClass().getSimpleName()))
                .append("\n");
        return stringBuffer.toString();
    }
}
