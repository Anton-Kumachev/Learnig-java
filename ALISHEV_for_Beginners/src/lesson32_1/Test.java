package lesson32_1;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        //Upcasting - Восходящее преобразование
        Animal animal = dog;
        animal.eat();
        //Downcasting - Нисходящее преобразование
        Dog dog2 = (Dog)animal;
        dog2.bark();
    }
}
