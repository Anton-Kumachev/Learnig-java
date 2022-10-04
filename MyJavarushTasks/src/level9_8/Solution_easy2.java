package level9_8;
//package com.javarush.task.task09.task0914;

/*
Группа перехвата исключений
*/

public class Solution_easy2 {
    public static void main(String[] args) {
        //напишите тут ваш код
        try {
            method1();
        //напишите тут ваш код
        } catch (Exception3 e) {
            System.out.println("Возникло исключение Exception3");
        } catch (Exception2 e) {
            System.out.println("Возникло исключение Exception2");
        } catch (Exception1 e) {
            System.out.println("Возникло исключение Exception1");
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

class Exception1 extends Exception {
}

class Exception2 extends Exception1 {
}

class Exception3 extends Exception2 {
}
