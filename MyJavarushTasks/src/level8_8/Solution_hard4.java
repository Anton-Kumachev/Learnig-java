package level8_8;
//package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Map;

/*
Нам повторы не нужны
*/

public class Solution_hard4 {

    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<>();
        map.put("Кумачёв", "Антон");
        map.put("Кумачёва", "Елизавета");
        map.put("Кумачёвский", "Марк");
        map.put("Кумачёвская", "Софья");
        map.put("Кумачёвый", "Андрей");
        map.put("Кумачёвая", "Наталья");
        map.put("Кумачёвыч", "Сергей");
        map.put("Ерохин", "Сергей");
        map.put("Ерохина", "Ольга");
        map.put("Ерохиная", "Олеся");

        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код

        Map<String, String> copyMap = new HashMap<>(map);

        for (String name : copyMap.values()) {
            int count = 0;
            for (String nameTmp : map.values()) {
                if (nameTmp.equals(name)) {
                    count++;
                }
            }
            if (count > 1) {
                removeItemFromMapByValue(map, name);
            }
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copyMap = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copyMap.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(createMap());
        Map<String, String> copyMap = createMap();

        removeTheFirstNameDuplicates(copyMap);

        for (Map.Entry<String, String> entry : copyMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
