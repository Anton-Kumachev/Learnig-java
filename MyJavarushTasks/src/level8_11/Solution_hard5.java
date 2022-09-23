package level8_11;
//package com.javarush.task.task08.task0827;

import java.util.Date;

/*
Работа с датой
*/

public class Solution_hard5 {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {
        Date yearStartTime = new Date();
        yearStartTime.setDate(1);      // первое число
        yearStartTime.setMonth(0);     // месяц январь, нумерация для месяцев 0-11

        Date currentDate = new Date(date);

        long msTimeDistance = currentDate.getTime() - yearStartTime.getTime();
        long msDay = 24 * 60 * 60 * 1000 + 1;  //сколько миллисекунд в одних сутках

        int dayCount = (int) (msTimeDistance/msDay); //количество целых дней

        if (dayCount % 2 == 1)
            return true;
        else
            return false;
    }
}
