package lesson20_3;

public class Homework_lesson20 {
    public static void main(String[] args) {

        May may = new May();
        may.name = "Барсик";
        may.color = "серый";
        may.breed = "подъездный кот";
        may.amount = 1;

        System.out.println("Меня зовут: " + may.name);
        System.out.println("Я: " + may.breed);
        System.out.println("В нашей семье я такой: " + may.amount + " и ещё есть у меня подружка Буся, " +
                           "она с рынка.");

        may.voice();
        may.eat();
        may.walk();
        may.sleep();
        may.morningMurr();

        System.out.println("");

        Cat cat = new May();
        cat.name = "Буся";
        cat.color = "чёрный";
        cat.breed = "рыночная кошка";
        cat.amount = 1;

        System.out.println("Меня зовут: " + cat.name);
        System.out.println("Я: " + cat.breed);
        System.out.println("В нашей семье я такая: " + may.amount + " и ещё у меня есть друг Барсик," +
                          " он \"подъездный кот\".");

        cat.voice();
        cat.eat();
        cat.walk();
        cat.sleep();
        // cat.morningMurr() - этот метод не вызовется, из-за создания объекта с помощью полиморфизма
    }
}
