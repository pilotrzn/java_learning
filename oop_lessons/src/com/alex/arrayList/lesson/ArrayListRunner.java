package com.alex.arrayList.lesson;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListRunner {

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>(5);
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);
        integers.add(6);
        integers.add(7);

        List<Integer> list = new ArrayList<>(integers);


        printArray(integers);
    }

    private static void printArray(List<Integer> list){
        for (Iterator<Integer> iterator = list.iterator(); iterator.hasNext();){
            Integer next = iterator.next();
            System.out.println(next);
        }
        list.iterator().forEachRemaining(System.out::println);

        list.forEach(System.out::println);
    }

}
