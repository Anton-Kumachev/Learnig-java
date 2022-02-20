package level7_12;
//package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Перестановочка подоспела
*/

public class Solution_hard1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //напишите тут ваш код
        int N = Integer.parseInt(reader.readLine()); //Ввод первого числа с клавиатуры
        int M = Integer.parseInt(reader.readLine()); //Ввод второго числа с клавиатуры

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < N ; i++) {
            list.add(reader.readLine()); //Добавляем в список то, что ввели с клавиатуры
        }

        for (int j = 0; j < M; j++) {
            list.add(list.remove(0));
        }

        for (String strings : list) {
            System.out.println(strings);
        }
    }
}