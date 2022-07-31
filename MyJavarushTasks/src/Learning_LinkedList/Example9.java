package Learning_LinkedList;

//Время работы для ArrayList (в миллисекундах)

import java.util.ArrayList;
import java.util.List;

public class Example9 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 5_000_000; i++) {
            list.add(new Integer(i));
        }

        long start = System.currentTimeMillis();

        for (int i = 0; i < 100; i++){
            list.add(2_000_000, new Integer(Integer.MAX_VALUE));//вставка в середину списка
        }
        System.out.println("Время работы для ArrayList (в миллисекундах) = " + (System.currentTimeMillis()-start));
    }
}
