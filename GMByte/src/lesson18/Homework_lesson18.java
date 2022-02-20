package lesson18;

public class Homework_lesson18 {

    public static void main(String[] args) {
        Dog goodDod = new Dog();
        goodDod.name = "Шторм";
        goodDod.age = 5;
        goodDod.breed = "Хаски";
        System.out.println("Меня зовут: " + goodDod.name);
        System.out.println("Мой возраст: " + goodDod.age + " лет");
        System.out.println("Моя порода: " + goodDod.breed);
        goodDod.bark();
        goodDod.eat();
        goodDod.walk();

        System.out.println("");

        Jack rassel = new Jack();
        rassel.name = "Майло";
        rassel.age = 3;
        rassel.breed = "Джек-Рассел терьер";
        System.out.println("Меня зовут: " + rassel.name);
        System.out.println("Мой возраст: " + rassel.age + " года");
        System.out.println("Моя порода: " + rassel.breed);
        rassel.bark();
        rassel.eat();
        rassel.walk();
        rassel.sleep();
    }
}
