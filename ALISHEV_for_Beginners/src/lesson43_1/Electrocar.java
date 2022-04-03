package lesson43_1;

public class Electrocar {
    private int id;

    private class Motor { // 1-й тип вложенного класса - Нестатический вложенный класс (Используется, когда у нас
                          // сложный объект
        public void startMotor() {
            System.out.println("Motor " + id + " is starting...");
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

