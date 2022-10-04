package level9_11;
//package com.javarush.task.task09.task0920;

/*
Обратный отсчёт Ӏ Java Syntax: 9 уровень, 11 лекция
*/

public class Solution_easy2 {
    public static void main(String[] args) {
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
            //напишите тут ваш код
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
