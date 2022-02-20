package lesson20_2;

public class Samsung extends PC {

    @Override
    void on() {
        System.out.println("Компьютер запущен");
    }

    @Override
    void off() {
        System.out.println("Компьютер отключен");
    }

    @Override
    void toMyCalculation() {
        System.out.println("Компьютер производит вычисления");
    }

    @Override
    void modification() {
        System.out.println("Меня модифицируют");
    }
}
