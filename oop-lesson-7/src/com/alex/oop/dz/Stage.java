package com.alex.oop.dz;

public class Stage {
    private int stageNumber;
    private Flat[] flats;
    public static int flatNumber = 1;

    public Stage(int stageNumber, int flatsOnStage) {
        this.stageNumber = stageNumber;
        flats = createFlats(flatsOnStage);
    }

    public int getStageNumber() {
        return stageNumber;
    }

    public Flat[] getFlats() {
        return flats;
    }

    private Flat[] createFlats(int flatOnStage) {
        Flat[] flatsArr = new Flat[flatOnStage];
        // int flatNumber = (stageNumber == 1) ? 1 : stageNumber * flatOnStage -
        // flatOnStage + 1;
        for (int i = 0; i < flatOnStage; i++) {
            int roomsCount = (i == 0 || i == 2) ? 3 : 2;
            flatsArr[i] = new Flat(flatNumber, roomsCount);
            flatNumber++;
        }
        return flatsArr;
    }

    public void print() {
        System.out.println("Этаж " + getStageNumber() + ". Квартир на этаже " + getFlats().length);
    }

    public void printAllInformation() {
        for (Flat flat : this.getFlats()) {
            flat.print();
            flat.printAllinformation();
        }
    }
}
