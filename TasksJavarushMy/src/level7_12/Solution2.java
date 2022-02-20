package level7_12;
//package com.javarush.task.task07.task0723;
/*
Обратный отсчёт Ӏ Java Syntax: 7 уровень, 12 лекция
*/
public class Solution2 {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 30; i >= 0; i--) {
            System.out.println(i);

            //напишите тут ваш код
            Thread.sleep(1000);
        }

        System.out.println("Бум!");
    }
}