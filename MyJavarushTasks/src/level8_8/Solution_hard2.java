package level8_8;
//package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Map;

/*
Перепись населения
*/

public class Solution_hard2 {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<>();
        map.put("Кумачёв", "Антон");
        map.put("Кумачёва", "Елизавета");
        map.put("Кумачёвский", "Антон");
        map.put("Кумачёвская", "Софья");
        map.put("Кумачёвый", "Антон");
        map.put("Кумачёвая", "Наталья");
        map.put("Кумачёвыч", "Сергей");
        map.put("Ерохин", "Сергей");
        map.put("Ерохина", "Ольга");
        map.put("Ерохиная", "Олеся");

        return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        //напишите тут ваш код
        int count = 0;
        for (String nameEq : map.values()) {
            if(nameEq.equals(name)) {
                count++;
            }
        }
        return count;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        //напишите тут ваш код
        int count = 0;
        if (map.containsKey(lastName))
            count++;
        return count;
    }

    public static void main(String[] args) {

        System.out.println(createMap());
        System.out.println(getCountTheSameFirstName(createMap(), "Антон"));
        System.out.println(getCountTheSameLastName(createMap(), "Кумачёв"));

    }
}
