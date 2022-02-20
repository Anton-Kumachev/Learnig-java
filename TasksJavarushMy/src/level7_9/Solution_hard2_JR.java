package level7_9;
//package com.javarush.task.task07.task0716;

import java.util.ArrayList;

/*
Р или Л - РЕШЕНИЕ ОТ JAVARUSH.
*/

public class Solution_hard2_JR {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {

        String r = "р";
        String l = "л";

        ArrayList<String> result = new ArrayList<>();
        for (String string : strings) {
            boolean isR = string.contains(r);
            boolean isL = string.contains(l);

            if (isR && !isL) {
                continue;
            }

            if (!isR && isL) {
                result.add(string);
            }

            result.add(string);
        }
        return result;
    }
}