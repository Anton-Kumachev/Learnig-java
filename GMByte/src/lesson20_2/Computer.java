package lesson20_2;

public abstract class Computer {
    byte a = 5;

    abstract void on(); //шаблон метода
    abstract void off(); //шаблон метода
    abstract void toMyCalculation(); //шаблон метода

    void test() {
        System.out.println("test");
    }
}
