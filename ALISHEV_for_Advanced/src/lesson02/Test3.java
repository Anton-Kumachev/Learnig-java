package lesson02;

import java.util.ArrayList;

//Динамичекский массив

public class Test3 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            arrayList.add(i);
        }

        arrayList.remove(5);
        System.out.println(arrayList);
    }
}
