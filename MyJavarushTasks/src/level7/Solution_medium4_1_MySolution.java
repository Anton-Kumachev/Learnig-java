package level7;
//package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Один большой массив и два маленьких
*/
public class Solution_medium4_1_MySolution {

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
            System.out.println("ПЕРВЫЙ младший массив: " + arraySmall1[i]);
        }
        System.out.println("");

        int[] arraySmall2 = new int[10]; //Создаём ВТОРОЙ массив на 10 элементов
        for (int i = 0; i < arraySmall2.length; i++) {
                arraySmall2[0] = arrayBig[10];
                arraySmall2[1] = arrayBig[11];
                arraySmall2[2] = arrayBig[12];
                arraySmall2[3] = arrayBig[13];
                arraySmall2[4] = arrayBig[14];
                arraySmall2[5] = arrayBig[15];
                arraySmall2[6] = arrayBig[16];
                arraySmall2[7] = arrayBig[17];
                arraySmall2[8] = arrayBig[18];
                arraySmall2[9] = arrayBig[19];
            System.out.println("ВТОРОЙ младший массив: " + arraySmall2[i]);
        }
    }
}