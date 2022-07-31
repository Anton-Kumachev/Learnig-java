package level7;
//package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Общение одиноких массивов
*/
public class Solution_medium3 {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] arrayStrings = new String[10]; //Создаём массив строк на 10 элементов
        int[] arrayNums = new int[10]; //Создаём массив чисел на 10 элементов

        for (int i = 0; i < 10; i++)
        {
            arrayStrings[i] = reader.readLine(); //Заполнение массива строками с клавиатуры
            arrayNums[i] = arrayStrings[i].length(); //Заполнение массива чисел
        }

        //вывод на экран
        for (int i = 0; i < 10; i++)
        {
            System.out.println(arrayNums[i]);
        }
    }
}
