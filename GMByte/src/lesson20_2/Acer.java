package lesson20_2;

public class Acer extends Notebooks {

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
        System.out.println("Произвожу вычисления");
    }

    @Override
    void jobBattary() {
        System.out.println("Работаем от батареи");
    }
}
