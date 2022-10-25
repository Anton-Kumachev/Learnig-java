package level12_12;
//package com.javarush.task.task12.task1232;

/*
Нужно добавить в программу новую функциональность
*/

public class Solution_easy11 {
    public static void main(String[] args) {
        Pegasus horse = new Pegasus();
    }

    public static interface CanFly {
        void fly();
    }

    public static class Horse {
        public void run() {

        }
    }

    public static class Pegasus extends Horse implements CanFly {
        public void run() {}
        public void fly() {}
    }
}
