package level9_2;
//package com.javarush.task.task09.task0906;

/*
Логирование стек-трейса
*/

public class Solution_easy5 {
    public static void main(String[] args) {
        log("In main method");
    }

    public static void log(String text) {
        //напишите тут ваш код
        String stackTraceClassName = Thread.currentThread().getStackTrace()[2].getClassName();
        String stackTraceMethodName = Thread.currentThread().getStackTrace()[2].getMethodName();
        System.out.println(stackTraceClassName + ": " + stackTraceMethodName + ": " + text);
    }
}

