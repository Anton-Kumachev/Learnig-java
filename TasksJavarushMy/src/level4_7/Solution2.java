package level4_7;
//package com.javarush.task.task04.task0427;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Описываем числа
*/

public class Solution2 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String num = reader.readLine(); //Ввод числа

        while (Integer.parseInt(num) > 0 && Integer.parseInt(num) < 1000) {
            if (Integer.parseInt(num)  % 2 == 0 && num.length() == 1) {
                System.out.println("четное однозначное число");
            } else if (Integer.parseInt(num) % 2 != 0 && num.length() == 1) {
                System.out.println("нечетное однозначное число");
            } else if (Integer.parseInt(num) % 2 == 0 && num.length() == 2) {
                System.out.println("четное двузначное число");
            } else if (Integer.parseInt(num) % 2 != 0 && num.length() == 2) {
                System.out.println("нечетное двузначное число");
            } else if (Integer.parseInt(num) % 2 == 0 && num.length() == 3) {
                System.out.println("четное трехзначное число");
            } else if (Integer.parseInt(num) % 2 != 0 && num.length() == 3) {
                System.out.println("нечетное трехзначное число");
            } //else if (num > 0 && length == 4) {
            break;}

    }
}