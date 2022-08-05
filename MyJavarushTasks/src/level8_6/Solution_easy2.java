package level8_6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
Время для 10 тысяч вставок
*/

public class Solution_easy2 {

    public static void main(String[] args) {
        System.out.println(getInsertTimeInMs(new ArrayList()));
        System.out.println(getInsertTimeInMs(new LinkedList()));
    }

    public static long getInsertTimeInMs(List list) {
        // напишите тут ваш код
        long start = System.currentTimeMillis();
        insert10000(list);
        // напишите тут ваш код
        long end = System.currentTimeMillis();
        long result = end - start;
        return result;
    }

    public static void insert10000(List list) {
        for (int i = 0; i < 10000; i++) {
            list.add(0, new Object());
        }
    }
}