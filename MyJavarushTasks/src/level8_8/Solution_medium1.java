package level8_8;
//package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/*
Только для богачей
*/

public class Solution_medium1 {
    public static Map<String, Integer> createMap() {
        //напишите тут ваш код
        Map<String, Integer> map = new HashMap<>();
        map.put("Кумачёв", 5500);
        map.put("Кумачёва", 4500);
        map.put("Иванов8", 800);
        map.put("Иванов1", 700);
        map.put("Иванов2", 600);
        map.put("Иванов3", 500);
        map.put("Иванов4", 400);
        map.put("Иванов5", 300);
        map.put("Иванов6", 200);
        map.put("Иванов7", 100);

        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        //напишите тут ваш код
        Map<String, Integer> copyMap = new HashMap<>(map);
        for (Map.Entry<String, Integer> pair : copyMap.entrySet()) {
            if(pair.getValue() < 500) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {

        Map<String, Integer> copyMap = createMap();
        removeItemFromMap(copyMap);

        for (Map.Entry<String, Integer> entry : copyMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}