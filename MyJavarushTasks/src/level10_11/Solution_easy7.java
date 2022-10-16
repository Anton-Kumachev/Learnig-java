package level10_11;
//package com.javarush.task.task10.task1018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/*
Поправочки нужны
*/

public class Solution_easy7 {
    HashMap<Integer, String> map;
    static Integer index;
    static String name;

    public Solution_easy7() {
        this.map = new HashMap<Integer, String>();
    }

    public static void main(String[] args) throws IOException {
        Solution_easy7 solution = new Solution_easy7();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            int index = Integer.parseInt(reader.readLine());
            String name = reader.readLine();
            solution.map.put(index, name);
        }

        for (Map.Entry<Integer, String> pair : solution.map.entrySet()) {
            index = pair.getKey();
            name = pair.getValue();
            System.out.println("Id=" + index + " Name=" + name);
        }
    }
}
