package lesson19;

public class KiaRio extends Car {

    int maxSpeed;
    int carWipers;
    int year;

    @Override
    void drive() {
        System.out.println("Я машина - Kia Rio - я хорошо еду и в городе и на трассе");
    }

    void sound() {
        System.out.println("У меня в салоне всегда классная музыка!");
    }
}
