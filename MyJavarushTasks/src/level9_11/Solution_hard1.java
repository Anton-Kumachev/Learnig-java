package level9_11;
//package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Solution_hard1 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        try {
            Date date = formatter.parse(str);
            SimpleDateFormat formatter2 = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);
            System.out.println(formatter2.format(date).toUpperCase());
        }
        catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
