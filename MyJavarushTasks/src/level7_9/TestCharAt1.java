package level7_9;

import java.util.ArrayList;

public class TestCharAt1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Сила");
        list.add("Воля");
        list.add("Упорство");

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j <list.get(i).length(); j++) {
                if (list.get(i).charAt(j) == 'о') {
                    System.out.println(list.get(i));
                }
            }
        }
    }
}
