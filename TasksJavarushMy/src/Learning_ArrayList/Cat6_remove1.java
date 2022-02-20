package Learning_ArrayList;

import java.util.ArrayList;

public class Cat6_remove1 {
    private String name;

    public Cat6_remove1(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

        ArrayList<Cat> cats = new ArrayList<>();
        Cat thomas = new Cat("Томас");             //0
        Cat behemoth = new Cat("Бегемот");         //1
        Cat philipp = new Cat("Филипп Маркович");  //2
        Cat pushok = new Cat("Пушок");             //3

        cats.add(thomas);
        cats.add(behemoth);
        cats.add(philipp);
        cats.add(pushok);
        System.out.println(cats.toString());

        cats.remove(behemoth);
        cats.remove(1);

        System.out.println(cats.toString());
    }
}