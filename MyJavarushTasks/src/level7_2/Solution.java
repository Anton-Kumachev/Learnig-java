package level7_2;

//package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/*
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
    ArrayList<String> list = new ArrayList<>();
    list.add("Строка 1");
    list.add("Строка 2");
    list.add("Строка 3");
    list.add("Строка 4");
    list.add("Строка 5");

    System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
