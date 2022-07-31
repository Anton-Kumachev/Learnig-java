package level7_6;
//package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

import static java.lang.Integer.MIN_VALUE;

/*
Выражаемся покороче
*/

public class Solution_medium1 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            list.add(reader.readLine());
        }

        int min = list.get(0).length();

        for (String string : list) {
            if (string.length() < min) {
                min = string.length();
            }
        }

        for(String string : list) {
            if (string.length() == min) {
                System.out.println(string);
            }
        }
    }
}


