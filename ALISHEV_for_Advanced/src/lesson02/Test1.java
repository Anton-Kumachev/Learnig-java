package lesson02;

import java.util.ArrayList;

//Динамичекский массив

public class Test1 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            arrayList.add(i);
        }
        System.out.println(arrayList);

        System.out.println("First element of massive: " + arrayList.get(0));
        System.out.println("Last element of massive: " + arrayList.get(99));

        System.out.println("Size of massive: " + arrayList.size());
    }
}
