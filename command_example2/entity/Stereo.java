package com.timurradko.command_example2.entity;

import com.timurradko.command_example2.CDType;

import java.util.Random;

public class Stereo {
    private int[] volumes = new int[21];
    private int volume = 0;

    {
        for (int i = 0; i < 21; i++) {
            volumes[i] = i;
        }
    }

    public void on() {
        System.out.println("Stereo system is on!");
    }

    public void off() {
        System.out.println("Stereo system is off!");
    }

    public void setCd() {
        Random random = new Random();
        CDType[] cdTypes = CDType.values();
        int numberOfSong = random.nextInt(cdTypes.length);
        System.out.println(String.format("Now playing the %s composition: %s...",
                cdTypes[numberOfSong].name().toLowerCase(),
                cdTypes[numberOfSong].getName()));
    }

    public void setDvd() {
        System.out.println("Set the DVD player");
    }

    public void setRadio() {
        System.out.println("Turned on the lovely radio wave");
    }

    public void setVolume(int volume) {
        if (volume < 0) {
            this.volume = 0;
        } else this.volume = Math.min(volume, 20);
        System.out.println(String.format("Volume is: %s", getVolume()));
    }

    public int getVolume() {
        return volume;
    }
}
