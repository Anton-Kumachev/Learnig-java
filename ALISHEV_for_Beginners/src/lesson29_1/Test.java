package lesson29_1;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        animal.eat();
        dog.eat();

        Animal animal2 = new Dog();
        animal2.eat();
        //animal2.bark(); - этот метод не доступен переменной animal2, так как мы рассматриваем здесь
        //собаку, как животное

        Dog dog2 = new Dog();
        dog2.eat();
        dog2.bark(); //а здесь мы рассматриваем собаку, как собаку :)
    }
}
