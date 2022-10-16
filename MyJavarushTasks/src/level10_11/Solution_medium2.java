package level10_11;
//package com.javarush.task.task10.task1015;

import java.util.ArrayList;

/*
Массив списков строк
*/

public class Solution_medium2 {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        //напишите тут ваш код
        ArrayList<String> array [] = new ArrayList[5];
        array[0] = new ArrayList<String>();
        array[1] = new ArrayList<String>();
        array[2] = new ArrayList<String>();
        array[3] = new ArrayList<String>();
        array[4] = new ArrayList<String>();

        for (int i = 0; i < array.length; i++) {
            array[i].add("Some text");
        }

        return array;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String string : list) {
                System.out.println(string);
            }
        }
    }
}
