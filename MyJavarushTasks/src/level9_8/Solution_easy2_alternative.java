package level9_8;
//package com.javarush.task.task09.task0914;

/*
Группа перехвата исключений
*/

public class Solution_easy2_alternative {
    public static void main(String[] args) {
        //напишите тут ваш код
        try {
            method1();
        //напишите тут ваш код
        } catch (Exception exception) {
            System.out.println(exception);
        }
    }

    public static void method1() throws Exception1, Exception2, Exception3 {
        int i = (int) (Math.random() * 3);
        if (i == 0) {
            throw new Exception1();
        } else if (i == 1) {
            throw new Exception2();
        } else if (i == 2) {
            throw new Exception3();
        }
    }
}

class Exception01 extends Exception {
}

class Exception02 extends Exception1 {
}

class Exception03 extends Exception2 {
}
