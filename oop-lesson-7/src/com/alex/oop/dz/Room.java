package com.alex.oop.dz;

public class Room {
    private boolean isEntrace;

    public Room(boolean isEntrace) {
        this.isEntrace = isEntrace;
    }

    public boolean isEntrace() {
        return isEntrace;
    }

    public void setEntrace(boolean entrace) {
        isEntrace = entrace;
    }

    public void print() {
        String roomType = "Проходная";
        if (!this.isEntrace()) {
            roomType = "Не проходная";
        }
        System.out.println(roomType);
    }

}
