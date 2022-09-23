package level8_11;
//package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/*
Однофамильцы и тёзки
*/

public class Solution_easy1 {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<>();
        //При возникновении одинаковых keys, элементы затираются, а одинаковые values никак не влияют на это
        map.put("Кумачёв", "Антон");
        map.put("Кумачёва", "Елизавета");
        map.put("Кумачёв", "Андрей");
        map.put("Кумачёвская", "Софья");
        map.put("Кумачёвый", "Антон");
        map.put("Кумачёва", "Наталья");
        map.put("Кумачёв", "Сергей");
        map.put("Ерохин", "Сергей");
        map.put("Ерохина", "Олеся");
        map.put("Ерохина", "Ольга");

        return map;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}

