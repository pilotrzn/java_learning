package com.alex.oop.dz;

/**
 * Представить в виде классов и их композиции следующую модель.
 * - Каждый дом содержит свой номер (int), и множество этажей (массив).
 * - Каждый этаж содержит номер этажа (int), и множество квартир (массив).
 * - Каждая квартира содержит свой номер (int), и множество комнат (массив).
 * - Каждая комната содержит поле проходная она или нет (boolean).
 * В каждом классе реализовать метод print, который на консоль выводит информацию об объекте (должны присутствовать все поля объекта!).
 * Например, метод print класса этаж должен выводить на консоль:
 * “Этаж 2, количество квартир 18”
 * Создание всех объектов вынести в отдельный класс с методом main.
 * Там же реализовать метод printAllInformation, который на вход принимает объект типа дом, и выводит информацию о нем, его этажах, квартирах и комнатах, вызывая методы print.
 */

public class BuildHouseRunner {
    public static void main(String[] args) {
        //Stage stage = new Stage(4, 4);
        //stage.print();
        //stage.printAllInformation();

        //Flat flat = new Flat(23, 3);
        //flat.print();
        //flat.printAllinformation();

        //Room room = new Room(false,2);
        //room.print();




        House house = new House(12, 22, 6);
        // house.print();
        house.printAllInformation();

    }
}
