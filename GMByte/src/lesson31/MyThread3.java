package lesson31;

public class MyThread3 implements Runnable { //реализация интерфейса Runnable

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Я - третий поток");
        }
    }
}
