package level12_6;
//package com.javarush.task.task12.task1214;

/*
Корова — тоже животное
*/

public class Solution_easy4 {
    public static void main(String[] args) {

    }

    public static abstract class Animal {

        public abstract String getName();
    }

    public static class Cow extends Animal {

        public String getName() {
            return "Корова";
        }
    }
}
