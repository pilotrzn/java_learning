package com.alex.tasks;


public class Task5 {
    public static void main(String[] args) {
        printLetters();
    }

    public static void printLetters() {
        for (char letter = 'b'; !isVowel(letter) ; letter++) {
            System.out.println(letter);
        }
    }

    public static boolean isVowel(char value){
        return value == 'a' || value == 'e';
    }
}
