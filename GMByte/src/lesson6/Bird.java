package lesson6;

public class Bird {
    byte weight = 100; //Вес
    byte wings = 50; //Размах крыльев
    byte maxFlightSpeed = 40; //Максимальная скорость полёта
    byte maxHeightFly = 30; //Макслимальная высота полёта

    void fly() {
        System.out.println("Я умею летать.");
    }
    void eat() {
        System.out.println("Я умею есть");
    }
    void walk() {
        System.out.println("Я умею ходить");
    }
    void eggs() {
        System.out.println("Я умею откладывать яйца");
    }
}
