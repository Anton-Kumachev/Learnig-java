package level9_11;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> listNumbers = new ArrayList<>();
        listNumbers.add(5);
        listNumbers.add(10);
        listNumbers.add(2);
        listNumbers.add(21);
        listNumbers.add(13);
        listNumbers.add(50);
        listNumbers.add(1);

        sort(listNumbers);
        System.out.println(listNumbers);
    }

    public static void sort(List listNumbers) {
        //Сортировка чисел:
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < listNumbers.size() - 1 ; i++) {
                int min = (int)listNumbers.get(i);
                if ((int)listNumbers.get(i + 1) > min) {
                    listNumbers.set(i,listNumbers.get(i + 1));
                    listNumbers.set(i + 1, min);
                    isSorted = false;
                }
            }
        }
    }

}
