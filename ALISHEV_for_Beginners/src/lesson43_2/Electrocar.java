package lesson43_2;

public class Electrocar {
    private int id;
    public static int test;
    // 1-й тип вложенного класса - Нестатический вложенный класс. Используется, когда у нас сложный объект.
    private class Motor {
        public void startMotor() {
            System.out.println("Motor " + id + " is starting...");
        }
    }
    // 2-й тип вложенного класса - Статический вложенный класс. Используется, когда нужно связать статические переменные
    // главного и вложенного классов и настроить между ними логику.
    public static class Battery {
        public void charge() {
            System.out.println("Battery is charging..." + test);
        }
    }


    public Electrocar(int id) {
        this.id = id;
    }

    public void start() {
        Motor motor = new Motor();
        motor.startMotor();
        System.out.println("Electrocar " + id + " is starting...");
    }
}

