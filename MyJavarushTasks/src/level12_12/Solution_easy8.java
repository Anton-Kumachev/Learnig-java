package level12_12;
//package com.javarush.task.task12.task1229;

/*
Родитель класса CTO
*/

public class Solution_easy8 {
    public static void main(String[] args) {
        CTO cto = new CTO();
        System.out.println(cto);
    }

    public static interface Businessman {
        void workHard();
    }

    public static class CTO extends Worker implements Businessman {

    }

    public static class Worker {
        public void workHard() {}

    }
}
