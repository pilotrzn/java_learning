package com.alex.arrayList.lesson;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
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

        List<Integer> list2 = new LinkedList<>();
        list2.add(23);
        list2.add(25);
        list2.add(26);
        list2.add(28);
        list2.add(20);
        printArray(list2);

        //printArray(integers);
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
