package level9_11;
//package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
Десять котов
*/

public class Solution_medium4 {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }
    public static Map<String, Cat> createMap() {
        //напишите тут ваш код
        Map<String, Cat> mapCats = new HashMap<>();
        mapCats.put("Кот1", new Cat("Кот1"));
        mapCats.put("Кот2", new Cat("Кот2"));
        mapCats.put("Кот3", new Cat("Кот3"));
        mapCats.put("Кот4", new Cat("Кот4"));
        mapCats.put("Кот5", new Cat("Кот5"));
        mapCats.put("Кот6", new Cat("Кот6"));
        mapCats.put("Кот7", new Cat("Кот7"));
        mapCats.put("Кот8", new Cat("Кот8"));
        mapCats.put("Кот9", new Cat("Кот9"));
        mapCats.put("Кот10", new Cat("Кот10"));

        return mapCats;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //напишите тут ваш код
        Set<Cat> setCats = new HashSet<>();
        setCats.addAll(map.values());

        return setCats;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }
}
