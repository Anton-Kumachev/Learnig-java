package Learning_ArrayList;

import java.util.ArrayList;

public class Cat6_remove2 {
    private String name;

    public Cat6_remove2(String name) {
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

        for (Cat cat: cats) {

            if (cat.name.equals("Бегемот")) {
                cats.remove(cat);
            }
        }

        System.out.println(cats);
    }
}