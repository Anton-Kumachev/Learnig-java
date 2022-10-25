package level12_12;
//package com.javarush.task.task12.task1230;

/*
Попадание в десятку
*/

public class Solution_easy9 {
    public static void main(String[] args) {
        Integer i = 5;
        int x = transformValue(i);

        System.out.println(x);
    }

    public static int transformValue(int i) {
        return i * i;
    }

    public static int transformValue(Integer i) {
        return 2 * i;
    }
}
