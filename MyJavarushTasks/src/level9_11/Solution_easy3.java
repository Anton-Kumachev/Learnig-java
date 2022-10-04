package level9_11;
//package com.javarush.task.task09.task0925;

/*
Статики не на своем месте
*/

public class Solution_easy3 {
    public static int A = 5;
    public static int B = 2 * A;
    public int C = A * B;
    public static int D = A * B;

    public static void main(String[] args) {
        Solution_easy3 solution = new Solution_easy3();
        solution.A = 5;

        Solution_easy3.D = 5;
    }

    public int getA() {
        return A;
    }

}

