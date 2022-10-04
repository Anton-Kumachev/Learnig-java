package level9_2;
//package com.javarush.task.task09.task0905;

/*
Там, в синих глубинах стек-трейса…
*/

public class Solution_easy4 {
    public static void main(String[] args) {
        int deep = getStackTraceDepth();
    }

    public static int getStackTraceDepth() {
        //напишите тут ваш код
        int stackTraceDepth = Thread.currentThread().getStackTrace().length;
        System.out.println(stackTraceDepth);
        return stackTraceDepth;

   }
}
