package lesson35_2;
//Анонимные классы
class Animal {
    public void eat() {
        System.out.println("Animal is eating...");
    }
}

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();

        Animal animal2 = new Animal() { // При таком создании объекта мы создаём анонимный класс, объект данного класса
                                        // мы можем использовать только 1 раз
            public void eat() {
                System.out.println("Other animal is eating...");
            }
        };
        animal2.eat();
    }
}
