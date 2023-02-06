package com.alex.oop.dz;

public class Flat {
    private int number;
    private Room[] rooms;

    private int roomsNumber;

    public Flat(int number, int roomsNumber) {
        this.number = number;
        this.rooms = createRooms(roomsNumber);
    }

    private Room[] createRooms(int roomsNumber) {
        boolean isEntrance = false;
        Room[] roomsArr = new Room[roomsNumber];
        for (int i = 0; i < roomsNumber; i++) {
            if (roomsNumber == 3 || i == 2){
                isEntrance = true;
            }
            Room room = new Room(isEntrance);
            roomsArr[i] = room;
        }
        return roomsArr;
    }
}
