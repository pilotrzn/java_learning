package com.alex.oop.dz;

public class Flat {
    private int number;
    private Room[] rooms;
    private int roomsNumber;

    public Flat(int number, int roomsNumber) {
        this.number = number;
        //create rooms array
        this.rooms = createRooms(roomsNumber);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Room[] getRooms() {
        return rooms;
    }

    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }

    public int getRoomsNumber() {
        return roomsNumber;
    }

    public void setRoomsNumber(int roomsNumber) {
        this.roomsNumber = roomsNumber;
    }

    private Room[] createRooms(int roomsNumber) {
        boolean isEntrance = false;
        Room[] roomsArr = new Room[roomsNumber];
        for (int i = 0; i < roomsNumber; i++) {
            if (roomsNumber == 3 && i == 1) {
                isEntrance = true;
            }
            roomsArr[i] = new Room(isEntrance);
        }
        return roomsArr;
    }
}
