package Learning_Collections;

//Вывод на экран элементов Map

import java.util.HashMap;

public class Example4_2_Map_foreach4 {
    public static void main(String[] args) {
        //все элементы хранятся в парах
        HashMap<Integer, String> map = new HashMap<Integer, String>();

        map.put(0, "Привет");
        map.put(1, "Hello");

        String s = map.get(0);
        map.put(0, s + "!");

        for (String item: map.values())
        {
            System.out.println(item);
        }
    }
}