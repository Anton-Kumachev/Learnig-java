package level12_6;
//package com.javarush.task.task12.task1215;

/*
Кошки не должны быть абстрактными!
*/

public class Solution_easy5 {
    public static void main(String[] args) {

    }

    public static abstract class Pet {
        public abstract String getName();

        public abstract Pet getChild();
    }

    public static class Cat extends Pet {

        public String getName() {
            return "Кот";
        }

        public Pet getChild() {
            return new Cat();
        }
    }

    public static class Dog extends Pet {

        public String getName() {
            return "Собака";
        }

        public Pet getChild() {
            return new Dog();
        }
    }
}