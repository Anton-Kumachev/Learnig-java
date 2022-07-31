package level7;
//package com.javarush.task.task07.task0705;
import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
Один большой массив и два маленьких
*/
public class Solution_medium4_2_true {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] arrayBig = new int[20]; //Создаём м ассив на 20 элементов
        int[] arraySmall1 = new int[10]; //Создаём ПЕРВЫЙ массив на 10 элементов

        for (int i = 0; i < arrayBig.length; i++) {
            arrayBig[i] = Integer.parseInt(reader.readLine());//Заполняем массив на 20 элементов с клавиатуры
        }

        for (int i = 0; i < arraySmall1.length; i++) {
            arraySmall1[i] = arrayBig[i];
        }
        System.out.println("");

        int[] arraySmall2 = new int[10]; //Создаём ВТОРОЙ массив на 10 элементов
        for (int i = 0; i < 10; i++) {
            arraySmall2[i] = arrayBig[i + 10];
            System.out.println(arraySmall2[i]);
        }
    }
}