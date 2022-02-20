package Learning_ArrayList;

import java.util.ArrayList;

public class Cat2 {
    private String name;

    public Cat2(String name) {
        this.name = name;
    }

    public static void main(String[] args) {


        ArrayList<Cat> cats = new ArrayList<Cat>();
        Cat thomas = new Cat("Томас");
        Cat behemoth = new Cat("Бегемот");
        Cat philipp = new Cat("Филипп Маркович");
        Cat pushok = new Cat("Пушок");

        cats.add(thomas);
        cats.add(behemoth);
        cats.add(philipp);
        cats.add(pushok);

        int thomasIndex = cats.indexOf(thomas);
        System.out.println(thomasIndex); //Вывод номера индекса элемента

        Cat secondCat = cats.get(1);
        System.out.println(secondCat); // Вывод элемента массива по номеру индекса

        cats.remove(pushok);
        System.out.println(cats.contains(pushok)); // Метод contains()Cat2 проверяет содержится ли элемент во внутреннем массиве
    }

    @Override
    public String toString() {
        return "Cat{" + "name='" + name + '\'' + '}';
    }
}
