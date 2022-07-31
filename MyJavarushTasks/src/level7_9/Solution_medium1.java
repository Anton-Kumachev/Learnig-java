package level7_9;
//package com.javarush.task.task07.task0715;

import java.util.ArrayList;

/*
Продолжаем мыть раму
*/

public class Solution_medium1 {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<String> strings = new ArrayList<>();
        strings.add("мама");
        strings.add("мыла");
        strings.add("раму");

        strings.add(1,"именно");
        strings.add(3,"именно");
        strings.add(5,"именно");

        //Вывод на экран с помощью цикла for:
        /*for (int i = 0; i < strings.size() ; i++) {
            System.out.println(strings.get(i));
        }*/

        //Альтернативный вывод на экран с помощью foreach
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
