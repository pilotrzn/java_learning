package com.alex.intro.hw;

public class Room {
    private boolean isEntrace;
    private int roomNumber;

    public int getRoomNumber() {
        return roomNumber;
    }

    public Room(boolean isEntrace, int roomNumber) {
        this.isEntrace = isEntrace;
        this.roomNumber = roomNumber;
    }

    public boolean isEntrace() {
        return isEntrace;
    }

    public void print() {
        String roomType = (!this.isEntrace) ? "Проходная" : "Не проходная";
        System.out.println("Комната " + this.getRoomNumber() + " " + roomType);
    }

}
