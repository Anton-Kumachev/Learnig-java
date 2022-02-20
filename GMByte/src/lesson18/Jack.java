package lesson18;

public class Jack extends Dog {
    @Override
    void bark() {
        super.bark();
        System.out.println("Я Джек-Рассел терьер! И я тоже умею лаять! Гав-гав-гав!");
    }

    void sleep() {
        System.out.println("Я всегда сплю на своём месте.");
    }
}
