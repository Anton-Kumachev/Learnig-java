package lesson43_3;

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
        final int x = 1; //Только к константам мы можем получать доступ из вложенного класса
        //3-й тип вложенного касса - Вложенный класс в методе.
        class SomeClass {
            public void someMethod() {
                System.out.println("x = " + x);
                System.out.println("id = " + id);
            }
        }

        SomeClass someObject = new SomeClass();
        test(someObject);
        System.out.println("Electrocar " + id + " is starting...");
    }

    private void test(Object object) {

    }
}

