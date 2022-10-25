package Temp.Test10;

public class Animal {
    public Animal() {
        System.out.println("Отработал конструктор Animal");
    }
}


class Cat extends Animal {

    public Cat() {
        System.out.println("Отработал конструктор Cat!");
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
    }
}
