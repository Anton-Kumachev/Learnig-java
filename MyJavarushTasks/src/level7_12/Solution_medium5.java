package level7_12;

//package com.javarush.task.task07.task0728;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
В убывающем порядке (Решил пузырьковым методом сортировки!)
*/


public class Solution_medium5 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        sort(array); //Сортируем по убыванию (самописный метод)

        for (int x : array) {
            System.out.println(x);
        }
    }

    public static void sort(int[] array) {
        //напишите тут ваш код
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                int max = array[i];
                if (array[i + 1] > max) {
                    array[i] = array[i + 1];
                    array[i + 1] = max;
                    isSorted = false;
                }
            }
        }
    }
}
