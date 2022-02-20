package level7_6;
//package com.javarush.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Удалить и вставить
*/

public class Solution_medium2 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            String s = reader.readLine();
            list.add(s);
        }

       /* for (int j = 0; j < 13; j++) { //Это альтернативный вариант решения
            String strDel = list.remove(4);
            list.add(0, strDel);
        }*/
        for (int i = 0; i < 13; i++) {
            list.add(0, list.remove(4));
        }

        for(String x : list) {
            System.out.println(x);
        }
    }
}