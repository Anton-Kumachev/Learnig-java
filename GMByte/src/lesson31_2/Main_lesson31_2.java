package lesson31_2;

public class Main_lesson31_2 {
    public static void main(String[] args) throws InterruptedException {

        MyThread mt = new MyThread();
        mt.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("Я - первый поток");
            Thread.sleep(1000);
        }
    }


}
