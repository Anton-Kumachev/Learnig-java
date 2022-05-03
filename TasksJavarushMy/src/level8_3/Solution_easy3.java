package level8_3;
//package com.javarush.task.task08.task0803;

/*
Коллекция Map из котов
*/

import java.util.HashMap;
import java.util.Map;

public class Solution_easy3 {
    public static void main(String[] args) throws Exception {
        String[] cats = new String[]{"васька", "мурка", "дымка", "рыжик", "серый", "снежок", "босс",
                                     "борис", "визя", "гарфи"};

        Map<String, Cat> map = addCatsToMap(cats);

        for (Map.Entry<String, Cat> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }


    public static Map<String, Cat> addCatsToMap(String[] cats) {
        //напишите тут ваш код
        Map<String, Cat> catMap = new HashMap<>();
        for (String cat : cats) {
            catMap.put(cat, new Cat(cat));
        }
        return catMap;
    }


    public static class Cat {
        String name;

        public Cat(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name != null ? name.toUpperCase() : null;
        }
    }
}