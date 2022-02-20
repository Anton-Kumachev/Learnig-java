package level4_7;
//package com.javarush.task.task04.task0427;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Описываем числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine()); //Перевод введённого с клавиатуры значения в числовой формат
        int length = String.valueOf(num).length(); //выяснение длины введённого числа

        while (num > 0 && num < 1000) {
            if (num % 2 == 0 && length == 1) {
                System.out.println("четное однозначное число");
            } else if (num % 2 != 0 && length == 1) {
                System.out.println("нечетное однозначное число");
            } else if (num % 2 == 0 && length == 2) {
                System.out.println("четное двузначное число");
            } else if (num % 2 != 0 && length == 2) {
                System.out.println("нечетное двузначное число");
            } else if (num % 2 == 0 && length == 3) {
                System.out.println("четное трехзначное число");
            } else if (num % 2 != 0 && length == 3) {
                System.out.println("нечетное трехзначное число");
            } //else if (num > 0 && length == 4) {
            break;}

    }
}