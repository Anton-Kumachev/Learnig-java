package lesson02;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//Динамичекский массив

public class Test4 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(); //Так делать удобнее, если ниже мы проводим много удалений, мы используем
                                                // свойства интефейса List и свойство полиморфизма

        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        list.remove(5);
        System.out.println(list);

        //Здесь мы проводим много удалений из списка
        list = new LinkedList<>();

    }
}
