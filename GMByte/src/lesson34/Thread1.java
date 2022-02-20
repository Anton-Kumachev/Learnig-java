package lesson34;

public class Thread1 implements Runnable { //реализация интерфейса Runnable

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            while (true) {
                if (Main_lesson34.a == 2) {
                    System.out.println("Я - второй поток");
                    Main_lesson34.a = 1;
                    break;
                }
            }
        }
    }
}