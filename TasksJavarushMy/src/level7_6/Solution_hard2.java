package level7_6;
//package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Самые-самые
*/

public class Solution_hard2 {

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            strings.add(reader.readLine());
        }

        int min = strings.get(0).length();
        //Находим минимальную длину строки
        for (String string : strings) {
            if (string.length() < min) {
                min = string.length();
            }
        }
        //Находим максимальную длину строки
        int max = strings.get(9).length();
        for (String string : strings) {
            if (string.length() > max) {
                max = string.length();
            }
        }

        for (String string : strings) {
            if (string.length() == min) {
                System.out.println(string);
                break;
            } else if (string.length() == max) {
                System.out.println(string);
                break;
            }
        }
    }
}