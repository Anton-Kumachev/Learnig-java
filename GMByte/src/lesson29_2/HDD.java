package lesson29_2;

public class HDD extends Laptop {

    byte volume = 120;

    void saveInfo() {
        System.out.println("Сохраняю информацию");
    }

    void loadInfo() {
        System.out.println("Загружаю информацию");
    }

    @Override
    void on() {
        System.out.println("Я включился - я HDD");;
    }
    @Override
    void job() {
        System.out.println("Я работаю - я HDD");;
    }
    @Override
    void off() {
        System.out.println("Я выключился - я HDD");;
    }


}
