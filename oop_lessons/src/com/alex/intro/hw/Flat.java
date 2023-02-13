package com.alex.intro.hw;

public class Flat {
    private int flatNumber;
    private Room[] rooms;

    public Flat(int flatNumber, int roomsCount) {
        this.flatNumber = flatNumber;
        //create rooms array
        this.rooms = createRooms(roomsCount);
    }

    public int getFlatNumber() {
        return flatNumber;
    }

    public Room[] getRooms() {
        return rooms;
    }

    private Room[] createRooms(int roomsCount) {
        Room[] roomsArr = new Room[roomsCount];
        for (int i = 0; i < roomsCount; i++) {
            boolean isEntrance = ((roomsCount == 1 || roomsCount == 3) && i == 1) ? false : true;
            roomsArr[i] = new Room(isEntrance, i + 1);
        }
        return roomsArr;
    }

    public void print() {
        System.out.println("Номер квартиры " + this.getFlatNumber() + ", комнат " + getRooms().length);
    }

    public void printAllinformation() {
        for (Room room : this.getRooms()) {
            room.print();
        }
    }
}

