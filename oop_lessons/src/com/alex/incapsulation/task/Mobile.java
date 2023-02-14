package com.alex.incapsulation.task;

public class Mobile extends Computer {

    public Mobile(Ram ram, SSD ssd) {
        super(ram, ssd);
    }

    @Override
    public void load() {
        System.out.println("мобильный включился");
    }
}
