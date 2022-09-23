package level8_11;
//package com.javarush.task.task08.task0819;

/*
Set из котов
*/


import java.util.HashSet;
import java.util.Set;

public class Solution_hard1 {

    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        //напишите тут ваш код. step 3 - пункт 3
        cats.remove(cats.iterator().next());
        printCats(cats);
    }

    public static Set<Cat> createCats() {
        //напишите тут ваш код. step 2 - пункт 2
        Set<Cat> setThreeCats = new HashSet<>();
        for (int i = 0; i < 3; i++) {
           setThreeCats.add(new Cat());
        }

        return setThreeCats;
    }

    public static void printCats(Set<Cat> cats) {
        // step 4 - пункт 4
        Set<Cat> copySet = new HashSet<>(cats);
        for (Cat set : copySet) {
            System.out.println(set);
        }
    }

    // step 1 - пункт 1
    public static class Cat {

    }
}
