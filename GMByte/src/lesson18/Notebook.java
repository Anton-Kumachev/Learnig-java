package lesson18;

public class Notebook extends Computer {

    @Override // Аннотация переопределения метода void on();
    void on() {
        super.on(); // Вызов метода on() из класса родителя Computer. Сделано это для того,
                    // чтобы не переписывать метод заново.
        System.out.println("Я ноутбук, я включен");
    }

    void jobB() {
        System.out.println("Работаю от батареи");
    }

}
