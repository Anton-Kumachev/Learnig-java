package Learning_ArrayList;

import java.util.ArrayList;

public class Cat3 {
    private String name;

    public Cat3(String name) {
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

        System.out.println(cats.toString());//Выводим полный список

        cats.set(0, philipp);//Сейчас у нас список из 4 котов. Заменяем thomas на philipp через set.
        cats.set(2, thomas);// Заменяем philipp на thomas также через set.

        System.out.println(cats.toString());
        System.out.println("Размер списка ArrayList: " + cats.size()); //Размер списка
    }
}