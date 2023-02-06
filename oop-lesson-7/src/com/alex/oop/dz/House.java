package com.alex.oop.dz;

public class House {
    private int houseNumber;
    private Stage[] stages;

    public int getHouseNumber() {
        return houseNumber;
    }

    public Stage[] getStages() {
        return stages;
    }

    public House(int number, int stageCount, int flatsOnStage) {
        this.houseNumber = number;
        stages = createStages(stageCount, flatsOnStage);
    }

    private Stage[] createStages(int stageCount, int flatsOnStage) {
        Stage[] stageArr = new Stage[stageCount];
        int currentStage = 1;
        for (int i = 0; i < stageCount; i++) {
            stageArr[i] = new Stage(currentStage, flatsOnStage);
            currentStage++;
        }
        return stageArr;
    }

    public void print() {
        System.out.println("Дом номер " + this.getHouseNumber() + ". В доме " + this.getStages().length + " этажей. ");
    }

    public void printAllInformation() {
        this.print();
        for (Stage stage : this.getStages()) {
            stage.print();
            stage.printAllInformation();
        }
    }

}
