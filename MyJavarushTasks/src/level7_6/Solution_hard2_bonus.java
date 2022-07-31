package level7_6;
//package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
/*
Самые-самые
*/

public class Solution_hard2_bonus {

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            strings.add(reader.readLine());
        }

        String min = strings.get(0);
        int indexmin = 0;
        String max = strings.get(0);
        int indexmax = 0;

        for (int i = 0; i < 10; i++) {
            if (strings.get(i).length() < min.length()) {
                min = strings.get(i);
                indexmin = i;
            } else if (strings.get(i).length() > max.length()) {
                max = strings.get(i);
                indexmax = i;
            }
        }
        if (indexmin < indexmax) {
                System.out.println(min);
            } else {
                System.out.println(max);
        }
    }
}