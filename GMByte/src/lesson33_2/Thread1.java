package lesson33_2;
// Уроки Java - №33 Синхронизированные блоки.

public class Thread1 implements Runnable {
    @Override
    public void run() {

    }

    static obj1 o = new obj1();

    static obj2 o2 = new obj2();

    static void staticTest1() {
        synchronized(o) {

        }
    }

    static void staticTest2() {
        synchronized(o2) {

        }
    }

    void test() {
        synchronized (obj1.class)
        {
        }
    }
    void test2() {
            synchronized (obj2.class)
            {
            }
    }
}