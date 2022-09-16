package level8_8;

import java.util.*;

public class Test1 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Кумачёв", "Антон");
        map.put("Кумачёва", "Елизавета");
        map.put("Кумачёвский", "Марк");
        map.put("Кумачёвская", "Софья");
        map.put("Кумачёвый", "Андрей");
        map.put("Кумачёвая", "Наталья");
        map.put("Кумачёвыч", "Сергей");
        map.put("Ерохин", "Сергей");
        map.put("Ерохина", "Ольга");
        map.put("Ерохиная", "Олеся");

        Map<String, String> copyMap = new HashMap<>(map);

        for (Map.Entry<String, String> pair : copyMap.entrySet()) {
            if (pair.getValue().equals("Сергей")) {
                map.remove(pair.getKey());
            }
        }

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
