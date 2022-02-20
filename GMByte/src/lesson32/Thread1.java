package lesson32;

public class Thread1 implements Runnable { //Реализация интерфейса Runnable - лучше по сравнению
                                          // с наследованием при создании потоков

    @Override
    public void run() {
        a("Thread1 ");
    }

    synchronized void a(String s) { // создан синхронизированный метод a
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(s + "Метод a");
    }

    void b(String s) { // создан обычный метод b
        System.out.println(s + "Метод b");
    }

    synchronized void c(String s) { // создан синхронизированный метод c
        System.out.println(s + "Метод c");
    }

    static synchronized void d(String s) { // создан статический синхронизированный метод d
        System.out.println(s + "Метод d");
    }

    static synchronized void e(String s) { // создан статический синхронизированный метод
        System.out.println(s + "Метод e");
    }
}
