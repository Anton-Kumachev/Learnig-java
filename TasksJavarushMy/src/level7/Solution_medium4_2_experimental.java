package level7;
//package com.javarush.task.task07.task0705;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Один большой массив и два маленьких
*/
public class Solution_medium4_2_experimental {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] arrayBig = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20}; //автоматическая инициализация - для проверки условий при решении задачи

        int[] arraySmall1 = new int[10]; //Создаём ПЕРВЫЙ массив на 10 элементов

        for (int i = 0; i < arraySmall1.length; i++) {
            arraySmall1[i] = arrayBig[i];
        }
        System.out.println("");

        int[] arraySmall2 = new int[10]; //Создаём ВТОРОЙ массив на 10 элементов
        for (int i = 0; i < 10; i++) {
            for (int j = 10; j < 20; j++) {
                arraySmall2[i] = arrayBig[i];
            }
            System.out.println(arraySmall2[i]);
        }
    }
}