package level7_12;
//package com.javarush.task.task07.task0721;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
Минимаксы в массивах
*/
public class Solution_medium1 {
    public static void main(String[] args) throws IOException {
        int maximum;
        int minimum;

        //напишите тут ваш код
        int[] array = getInts();
        Arrays.sort(array);
        maximum = array[array.length - 1];
        minimum = array[0];

        System.out.println("Максимальный элемент массива: " + maximum);
        System.out.println("Минимальный элемент массива: " + minimum);
    }

    //напишите тут ваш код
    public static int[] getInts() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        return array;
    }
}