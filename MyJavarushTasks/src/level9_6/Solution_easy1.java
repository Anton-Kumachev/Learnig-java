package level9_6;
//package com.javarush.task.task09.task0907;

/*
Исключение при работе с числами Ӏ Java Syntax: 9 уровень, 6 лекция
*/

public class Solution_easy1 {
    public static void main(String[] args) {
        //напишите тут ваш код
        try {
            int a = 42 / 0;
        //напишите тут ваш код
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}
