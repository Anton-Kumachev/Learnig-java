package level10_11;
//package com.javarush.task.task10.task1011;

/*
Большая зарплата
*/

public class Solution_easy4 {
    public static void main(String[] args) {
        String text = "Я не хочу изучать Java, я хочу большую зарплату";
        //напишите тут ваш код
        for (int i = 0; i < 40; i++) {
            System.out.println(text.substring(i));
        }
    }
}
