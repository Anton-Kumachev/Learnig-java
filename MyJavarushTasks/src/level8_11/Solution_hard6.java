package level8_11;
//package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/*
Модернизация ПО
*/

public class Solution_hard6 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, String> map = new HashMap<>();
        while (true) {
            String town = reader.readLine();
            if (town.isEmpty()) {
                break;
            }
            String family = reader.readLine();
            if (town.isEmpty()) {
                break;
            }

            map.put(town, family);
        }

        // Read the house number
        String town = reader.readLine();

        for (Map.Entry<String, String> pair : map.entrySet()) {
            if (town.equals(pair.getKey())) {
                String town2 = pair.getValue();

                System.out.println(town2);
            }
        }
    }
}
