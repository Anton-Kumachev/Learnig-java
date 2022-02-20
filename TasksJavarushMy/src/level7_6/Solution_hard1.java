package level7_6;
//package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Самая длинная строка
*/

public class Solution_hard1 {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        strings = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            String s = reader.readLine();
            strings.add(s);
        }
        String maxStr = strings.get(0);

        for (int j = 0; j < strings.size(); j++) {
            if (strings.get(j).length() > maxStr.length()) {
                maxStr = strings.get(j);
            }
        }

        for (int k = 0; k < strings.size(); k++) {
            if (strings.get(k).length() == maxStr.length()) {
                System.out.println(strings.get(k));
            }
         }
    }
}