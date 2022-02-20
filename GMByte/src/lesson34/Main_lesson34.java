package lesson34;

public class Main_lesson34 {

    static byte a = 1;

    public static void main(String[] args) {

        Thread1 t1 = new Thread1();
        Thread t = new Thread(t1);
        t.start();

        for (int i = 0; i < 10; i++) {
            while (true) {
                if (a == 1) {
                    System.out.println("Я - первый поток");
                    a = 2;
                    break;
                }
            }
        }
    }
}