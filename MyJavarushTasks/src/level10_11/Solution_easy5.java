package level10_11;
//package com.javarush.task.task10.task1014;

/*
Расставьте минимум static-ов
*/

public class Solution_easy5 {
    public int A = 5;
    public static int B = 5;
    public static int C = 5;
    public static int D = 5;

    public static void main(String[] args) {
        Solution_easy5 solution = new Solution_easy5();
        solution.A = 5;
        solution.B = 5 * B;
        solution.C = 5 * C * D;
        Solution_easy5.D = 5 * D * C;

        Solution_easy5.D = 5;
    }

    public int getA() {
        return A;
    }

}

