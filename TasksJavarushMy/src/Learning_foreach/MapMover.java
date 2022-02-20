package Learning_foreach;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapMover {
    public static void main (String[] args) {
        HashMap<String, String> namesHashMap = new HashMap<>();
        namesHashMap.put("Николаев", "Коля");
        namesHashMap.put("Петров", "Петя");
        namesHashMap.put("Васильев", "Вася");
        namesHashMap.put("Машкина", "Маша");
        namesHashMap.put("Иринова", "Ира");
        namesHashMap.put("Владимиров", "Вова");

        for (String s : namesHashMap.keySet()) {
            System.out.print(s + " ");
        }

        System.out.println(); //Переход на новую строку
        System.out.println(); //Пропуск строки

        for (String s : namesHashMap.values()) {
            System.out.print(s + " ");
        }

        System.out.println();

        for (Map.Entry<String, String> s : namesHashMap.entrySet()) {
            System.out.print(s + " ");
        }
    }
}