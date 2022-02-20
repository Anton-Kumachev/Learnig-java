package level7_9;
//package com.javarush.task.task07.task0716;

import java.util.ArrayList;

/*
Р или Л - перезагрузка. Моё решение через contains();
*/

public class Solution_hard2_R_and_L_reload {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        //напишите тут ваш код
        for (int i = 0; i < strings.size(); i++) {
            String str = strings.get(i);

            Boolean r = strings.get(i).contains("р");
            Boolean l = strings.get(i).contains("л");

            if (r && !l) {
            strings.remove(str);
            i--;
            }
            if (l && !r) {
                strings.add(i, strings.get(i));
                i++;
            }
        }
        return strings;
    }
}