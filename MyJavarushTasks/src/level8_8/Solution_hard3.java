package level8_8;
//package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/*
Добрая Зинаида и летние каникулы
*/

public class Solution_hard3 {

    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Смирнов", dateFormat.parse("MAY 1 2012"));
        //напишите тут ваш код
        map.put("Иванов", dateFormat.parse("JUNE 1 2012"));
        map.put("Петров", dateFormat.parse("JULY 1 2012"));
        map.put("Сидоров", dateFormat.parse("SEPTEMBER 1 2012"));
        map.put("Козлов", dateFormat.parse("AUGUST 1 2012"));
        map.put("Пыхтин", dateFormat.parse("OCTOBER 1 2012"));
        map.put("Самокаткин", dateFormat.parse("DECEMBER 1 2012"));
        map.put("Дубинин", dateFormat.parse("MARCH 1 2012"));
        map.put("Березовский", dateFormat.parse("APRIL 1 2012"));
        map.put("Пугачёв", dateFormat.parse("FEBRUARY 1 2012"));

        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        //напишите тут ваш код
        Map<String, Date> copyMap = new HashMap<>(map);
        for (String key : copyMap.keySet()) {
            Date date = copyMap.get(key);
            if(date.getMonth() == 5 || date.getMonth() == 6 || date.getMonth() == 7) {
                map.remove(key);
            }
        }
    }

    public static void main(String[] args) throws ParseException {

        removeAllSummerPeople(createMap());

        for (Map.Entry<String, Date> entry : createMap().entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
