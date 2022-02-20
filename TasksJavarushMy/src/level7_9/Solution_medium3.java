package level7_9;
//package com.javarush.task.task07.task0718;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
/*
Проверка на упорядоченность
*/
public class Solution_medium3 {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            strings.add(reader.readLine());
        }

        for (int i = 0; i < strings.size()-1; i++) {
            if (strings.get(i).length() >= strings.get(i + 1).length()) {
                System.out.println(strings.indexOf(strings.get(i + 1)));
                break;
            }
            if (strings.get(i).length() < strings.get(i + 1).length()) {
                return;
            }
        }
    }
}