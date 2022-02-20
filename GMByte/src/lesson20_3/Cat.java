package lesson20_3;

public abstract class Cat { // Это шаблон для других классов и объектов
    String name;
    String color;
    String breed;
    int amount;

    abstract void voice();
    abstract void eat();
    abstract void walk();
    abstract void sleep();
}
