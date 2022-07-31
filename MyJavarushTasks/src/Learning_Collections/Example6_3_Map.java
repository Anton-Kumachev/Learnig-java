package Learning_Collections;

import java.util.HashMap;

public class Example6_3_Map {
    public static void main(String[] args) {
        HashMap<Integer, String> passportsAndNames = new HashMap<>();

        passportsAndNames.put(212133, "Лидия Аркадьевна Бубликова");
        passportsAndNames.put(162348, "Иван Михайлович Серебряков");
        passportsAndNames.put(8082771, "Дональд Джон Трамп");

        System.out.println(passportsAndNames.containsKey(11111));
        System.out.println(passportsAndNames.containsValue("Дональд Джон Трамп"));
    }
}
