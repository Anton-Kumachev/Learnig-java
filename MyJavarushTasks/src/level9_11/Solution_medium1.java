package level9_11;
//package com.javarush.task.task09.task0921;

/*
Метод в try..catch
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution_medium1 {
    public static void main(String[] args) {
        readData();
    }
    public static void readData() {
        //напишите тут ваш код
        List<Integer> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            while (true) {
                int number = Integer.parseInt(reader.readLine());
                list.add(number);
            }
        } catch (Exception e) {
            for (Integer numbers : list) {
                System.out.println(numbers);
            }
        }
    }
}
