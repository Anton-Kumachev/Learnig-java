package level7;
//package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Улицы и дома
*/

public class Solution_medium5  {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[15]; //Создаём массив на 15 элементов
        int numChet = 0;
        int numNechet = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());//Заполняем массив на 15 элементов с клавиатуры

            if (i % 2 == 0) {
                numChet = numChet + array[i];
            } else {
                numNechet = numNechet + array[i];
            }
        }
        if (numNechet > numChet) {
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
//        } else if (numNechet == numChet) {   Этот блок кода можно исключить за счёт применения
//            System.out.println("");          повторного конкретного сравнения numNechet и numChet
        } else if (numChet > numNechet){
            System.out.println("В домах с четными номерами проживает больше жителей.");
        }
    }
}