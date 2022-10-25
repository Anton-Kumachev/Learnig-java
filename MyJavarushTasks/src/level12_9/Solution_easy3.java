package level12_9;
//package com.javarush.task.task12.task1218;

/*
Есть, летать и двигаться
*/

public class Solution_easy3 {
    public static void main(String[] args) {

    }

    public interface CanFly {
        void fly();
    }

    public interface CanMove {
        void move();
    }

    public interface CanEat {
        void eat();
    }

    public class Dog implements CanMove, CanEat {
        public void move() {
        }

        public void eat() {
        }
    }

    public class Duck implements CanMove, CanFly, CanEat {
        public void move() {
        }

        public void fly() {
        }

        public void eat() {
        }
    }

    public class Car implements CanMove {
        public void move() {
        }
    }

    public class Airplane implements CanMove, CanFly {
        public void move() {
        }

        public void fly() {
        }
    }
}
