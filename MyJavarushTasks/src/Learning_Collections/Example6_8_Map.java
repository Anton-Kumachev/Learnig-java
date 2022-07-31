package Learning_Collections;

import java.util.HashMap;
import java.util.Map;

public class Example6_8_Map {
    public static void main(String[] args) {
        HashMap<Integer, String> passportsAndNames = new HashMap<>();

        passportsAndNames.put(212133, "Лидия Аркадьевна Бубликова");
        passportsAndNames.put(162348, "Иван Михайлович Серебряков");
        passportsAndNames.put(8082771, "Дональд Джон Трамп");

        for (Map.Entry entry: passportsAndNames.entrySet()) {
            System.out.println(entry);
        }
    }
}