package com.timurradko.command_example2;

public enum RoomName {
    LIVING_ROOM("Living Room"),
    KITCHEN("Kitchen"),
    BATHROOM("Bathroom");
    private String nameRoom;

    RoomName(String nameRoom) {
        this.nameRoom = nameRoom;
    }

    public String getNameRoom() {
        return nameRoom;
    }
}
