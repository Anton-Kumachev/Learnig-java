package level7_9;
//package com.javarush.task.task07.task0715;

import java.util.ArrayList;

/*
Продолжаем мыть раму
*/

public class Solution_medium1_bonus {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<String> strings = new ArrayList<>();
        strings.add("мама");
        strings.add("мыла");
        strings.add("раму");

        for (int i = 1; i < strings.size() + 1; i = i + 2) {
            strings.add(i, "именно");
        }
        //Вывод на экран
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
