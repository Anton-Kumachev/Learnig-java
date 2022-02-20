package level7_9;
//package com.javarush.task.task07.task0716;

import java.util.ArrayList;

/*
Р или Л - трудная задача. Моё решение через charAt(). ВЫДАЁТ ОШИБКУ - НЕ РЕШЕНО (ПОДУМАТЬ).
*/

public class Solution_hard2 {
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

            for (int j = 0; j < strings.get(i).length(); j++) {

                if (strings.get(i).charAt(j) == 'р' && !(strings.get(i).charAt(j) == 'л')) {
                    strings.remove(i);
                    i--;
                }
                if (strings.get(i).charAt(j) == 'л' && !(strings.get(i).charAt(j) == 'р')) {
                    strings.add(i, strings.get(i));
                    i++;
                }
            }
        }
        return strings;
    }
}