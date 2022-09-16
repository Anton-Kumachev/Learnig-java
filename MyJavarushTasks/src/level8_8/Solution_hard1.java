package level8_8;
//package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Set;

/*
Больше 10? Вы нам не подходите
*/

public class Solution_hard1 {
    public static Set<Integer> createSet() {
        // напишите тут ваш код
        Set<Integer> setNums = new HashSet<>();
        while (setNums.size() < 20) {
            setNums.add((int) Math.round(Math.random() * 100));
        }
        return setNums;
    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        // напишите тут ваш код
    Set<Integer> setCopy = new HashSet<>(set);
        for (Integer number : setCopy) {
            if (number > 10) {
                set.remove(number);
            }
        }
        return set;
    }
    public static void main(String[] args) {

        System.out.println(createSet());
        System.out.println(removeAllNumbersGreaterThan10(createSet()));
    }
}
