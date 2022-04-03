package lesson29_2;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Dog(); //Позднесвязанное
        animal.eat(); //Вызывается метод потомка, в котором он переопределён

        Animal animalAll = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        test(animalAll);
        test(dog);
        test(cat);
    }

    public static void test(Animal animal) {
        animal.eat();
    }
}

