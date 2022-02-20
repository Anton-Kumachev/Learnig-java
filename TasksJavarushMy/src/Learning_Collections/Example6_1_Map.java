package Learning_Collections;

import java.util.HashMap;

public class Example6_1_Map {
    public static void main(String[] args) {
        HashMap<Integer, String> passportsAndNames = new HashMap<>();

        passportsAndNames.put(212133, "Лидия Аркадьевна Бубликова");
        passportsAndNames.put(162348, "Иван Михайлович Серебряков");
        passportsAndNames.put(8082771, "Дональд Джон Трамп");
        passportsAndNames.put(162348, "Виктор Михайлович Стычкин");//повторный ключ при выводе заменти предыдущий элемент с таким же ключом

        System.out.println(passportsAndNames);
    }
}
