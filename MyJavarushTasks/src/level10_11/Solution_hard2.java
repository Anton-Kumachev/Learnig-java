package level10_11;
//package com.javarush.task.task10.task1019;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;


/*
Функциональности маловато!
*/

public class Solution_hard2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<Integer, String> map = new HashMap<>();
        while (true) {
            String number = reader.readLine();
            if (number.isEmpty()) {
                break;
            }
            int id = Integer.parseInt(number);
            String name = reader.readLine();
            map.put(id, name);
        }
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getValue() + " " + entry.getKey());
        }
    }
}
