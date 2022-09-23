package level8_11;
//package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
Номер месяца
*/

public class Solution_medium3 {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();

        List<String> list = new ArrayList<>();
        list.add("January");
        list.add("February");
        list.add("March");
        list.add("April");
        list.add("May");
        list.add("June");
        list.add("July");
        list.add("August");
        list.add("September");
        list.add("October");
        list.add("November");
        list.add("December");

        //подумать над вариантами реализации условий
        if (str.equalsIgnoreCase(list.get(0)))
            System.out.println(list.get(0) + " is the 1 month");
        else if (str.equalsIgnoreCase(list.get(1)))
            System.out.println(list.get(1) + " is the 2 month");
        else if (str.equalsIgnoreCase(list.get(2)))
            System.out.println(list.get(2) + " is the 3 month");
        else if (str.equalsIgnoreCase(list.get(3)))
            System.out.println(list.get(3) + " is the 4 month");
        else if (str.equalsIgnoreCase(list.get(4)))
            System.out.println(list.get(4) + " is the 5 month");
        else if (str.equalsIgnoreCase(list.get(5)))
            System.out.println(list.get(5) + " is the 6 month");
        else if (str.equalsIgnoreCase(list.get(6)))
            System.out.println(list.get(6) + " is the 7 month");
        else if (str.equalsIgnoreCase(list.get(7)))
            System.out.println(list.get(7) + " is the 8 month");
        else if (str.equalsIgnoreCase(list.get(8)))
            System.out.println(list.get(8) + " is the 9 month");
        else if (str.equalsIgnoreCase(list.get(9)))
            System.out.println(list.get(9) + " is the 10 month");
        else if (str.equalsIgnoreCase(list.get(10)))
            System.out.println(list.get(10) + " is the 11 month");
        else if (str.equalsIgnoreCase(list.get(11)))
            System.out.println(list.get(11) + " is the 12 month");
        else
            System.out.println("Вы ввели некорректное значение!");
    }
}
