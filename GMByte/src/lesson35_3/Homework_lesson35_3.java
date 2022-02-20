package lesson35_3;

public class Homework_lesson35_3 {

    public static void main(String[] args) {

        Bird lorry = new Bird();
        Cat kitty = new Cat();
        Dog hunter = new Dog();

        call(lorry);
        System.out.println("");

        call(kitty);
        System.out.println("");

        call(hunter);
    }

    static void call(Object obj) {
        if (obj instanceof Bird) {
            System.out.println("Я " + Bird.breedBird + ", у меня:");
            System.out.println("Длина клюва: " + Bird.beakLength + " см");
            System.out.println("Размах крыльев: " + Bird.wingSpan + " см");
            System.out.println("Длина ног: " + Bird.legLength + " см");
            System.out.println("Толщина оперения: " + Bird.featheringThickness + " см");
            System.out.println("Вес: " + Bird.weight + " кг");
            Bird.fly();
            Bird.walk();
            Bird.swim();
            Bird.eat();

        } else if (obj instanceof Cat) {
            System.out.println("Я " + Cat.breedCat + ", у меня:");
            System.out.println("Цвет: " + Cat.colorCat);
            System.out.println("Вес: " + Cat.weight + " кг");
            System.out.println("Максимальная скорость бега: " + Cat.maxSpeed + " см/с");
            System.out.println("Длина тела: " + Cat.bodyLength + " см");
            Cat.sayMyo();
            Cat.walkFlat();
            Cat.catchMouse();
            Cat.eat();

        } else if (obj instanceof Dog) {
            System.out.println("Я " + Dog.breedDog + ", у меня:");
            System.out.println("Цвет: " + Dog.colorDog);
            System.out.println("Вес: " + Dog.weight + " кг");
            System.out.println("Максимальная скорость бега: " + Dog.maxSpeed + " м/с");
            System.out.println("Длина тела: " + Dog.bodyLength + " см");
            Dog.bark();
            Dog.walkStreet();
            Dog.run();
            Dog.eat();
        }
    }
}