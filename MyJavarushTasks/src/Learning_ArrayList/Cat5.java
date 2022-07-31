package Learning_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Cat5 {
    private String name;

    public Cat5(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

        ArrayList<Cat> cats = new ArrayList<>();

        Cat thomas = new Cat("Томас");
        Cat behemoth = new Cat("Бегемот");
        Cat philipp = new Cat("Филипп Маркович");
        Cat pushok = new Cat("Пушок");

        cats.add(thomas);
        cats.add(behemoth);
        cats.add(philipp);
        cats.add(pushok);
        System.out.println("Размер списка cats: " + cats.size());

// Получение массива из объекта ArrayList. Для этого используется метод toArray():
        Cat[] catsArray = cats.toArray(new Cat[0]); //Передача пустого массива увеличивает его производительность.

        System.out.println(Arrays.toString(catsArray));

    }
}