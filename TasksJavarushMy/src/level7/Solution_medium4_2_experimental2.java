package level7;
//package com.javarush.task.task07.task0705;

import java.util.Arrays;

/*
Один большой массив и два маленьких
*/
public class Solution_medium4_2_experimental2 {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] arrayBig = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20}; //автоматическая инициализация - для проверки условий при решении задачи
        //int[] arrayBig = new int[20]; //автоматическая инициализация - для проверки условий при решении задачи

        int[] arraySmall1 = new int[10]; //Создаём ПЕРВЫЙ массив на 10 элементов
        int[] arraySmall2 = new int[10]; //Создаём ВТОРОЙ массив на 10 элементов

        for (int i = 0; i < arraySmall1.length; i++) {
            arrayBig[i] = i;
        }

        for (int i = 0, j = 10; j < arrayBig.length; i++, j++) {
            arraySmall1[i] = arrayBig[i];
            arraySmall2[i] = arrayBig[j];
        }
        System.out.println(Arrays.toString(arraySmall1));
        System.out.println(Arrays.toString(arraySmall2));
    }
}
