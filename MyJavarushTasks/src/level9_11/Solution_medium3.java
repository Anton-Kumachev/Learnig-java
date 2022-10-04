package level9_11;
//package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/*
Список из массивов чисел
*/

public class Solution_medium3 {

    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        //напишите тут ваш код
        ArrayList<int[]> listArrays = new ArrayList<>();
        listArrays.add(new int[] {1, 2, 3, 4, 5});
        listArrays.add(new int[] {1, 2});
        listArrays.add(new int[] {1, 2, 3, 4});
        listArrays.add(new int[] {1, 2, 3, 4, 5, 6, 7});
        listArrays.add(new int[]{});

        return listArrays;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
