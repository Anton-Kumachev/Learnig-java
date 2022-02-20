package Learning_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Cat4 {
    private String name;

    public Cat4(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

        Cat thomas = new Cat("Томас");
        Cat behemoth = new Cat("Бегемот");
        Cat philipp = new Cat("Филипп Маркович");
        Cat pushok = new Cat("Пушок");

        Cat[] catsArray = {thomas, behemoth, philipp, pushok};
        //Получаем содержимое массива в виде списка и передаем его в конструктор нашего ArrayList:
        ArrayList<Cat> catsList = new ArrayList<>(Arrays.asList(catsArray));
        System.out.println(catsList);


    }
}