package Learning_Massives;

import java.util.Arrays;

public class MainClassCat {
    private String name;

    public MainClassCat(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

        MainClassCat[] cats = new MainClassCat[3];
        cats[0] = new MainClassCat("Томас");
        cats[1] = new MainClassCat("Бегемот");
        cats[2] = new MainClassCat("Филипп Маркович");

        System.out.println(Arrays.toString(cats)); //Метод Arrays.toString() выводит только весь массив на экран,
                                                   //отдельно по одному элементу не выводит.
        System.out.println(cats[0]);
        System.out.println(cats[1]);
        System.out.println(cats[2]);

    }
    @Override
    public String toString() {
        return name;
    }
}
