package level12_9;
//package com.javarush.task.task12.task1220;

/*
Класс Human и интерфейсы CanRun, CanSwim
*/

public class Solution_easy5 {
    public static void main(String[] args) {

    }

    //add public interfaces and a public class here - добавь public интерфейсы и public класс тут
    public interface CanRun {

        void run();
    }
    public interface CanSwim {

        void swim();
    }

    public abstract class Human implements CanRun, CanSwim {

    }
}
