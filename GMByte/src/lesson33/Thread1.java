package lesson33;
// Уроки Java - №33 Синхронизированные блоки.

public class Thread1 implements Runnable {
    @Override
    public void run() {

    }

    static void staticTest() { //Это статический метод
        System.out.println(1);

        synchronized (Object.class) { //Пирвязываем синхронизацию к классу
            System.out.println(2);
        }

        System.out.println(3);
    }

    void test() {

        System.out.println(1); //сюда имеют доступ сколько угодно потоков

        synchronized (this) { // засинхронизированная часть кода, сюда может заходит только один поток
        System.out.println(2);
        }

        System.out.println(3); //сюда имеют доступ сколько угодно потоков
    }
}
