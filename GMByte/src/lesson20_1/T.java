package lesson20_1;

public class T extends Computer {

    @Override
    void on() {
        System.out.println("Я включился");
    }

    @Override
    void off() {
        System.out.println("Я выключился");
    }

    @Override
    void toMyCalculation() {
        System.out.println("Я произвожу вычисления");
    }
}
