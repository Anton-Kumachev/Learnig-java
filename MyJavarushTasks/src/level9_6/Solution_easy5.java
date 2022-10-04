package level9_6;
//package com.javarush.task.task09.task0911;

import java.util.HashMap;

/*
Исключение при работе с коллекциями Map
*/

public class Solution_easy5 {
    public static void main(String[] args) {
        //напишите тут ваш код
        try {
            HashMap<String, String> map = new HashMap<String, String>(null);
            map.put(null, null);
            map.remove(null);
            //напишите тут ваш код
        } catch (NullPointerException e) {
            System.out.println(e);
        }
    }
}
