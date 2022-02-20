package lesson31;

public class Main_lesson31 {
    //Это главный поток
    public static void main(String[] args) throws InterruptedException {

        MyThread mt = new MyThread(); //Создаём объект класса, в котором запущен второй поток
        Thread t = new Thread(mt); //Тут создаём стандартный объект из класса Thread, в аргументах
                                   // указываем mt - ссылку на новый объект второго потока для запуска
                                   // потов одновременно (в связке / здесь онитработают не синхронно)
        MyThread3 mt3 = new MyThread3();
        Thread t3 = new Thread(mt3); // создание объекта по третьему потоку

        t.start();
        t3.start();


        for (int i = 0; i < 10; i++) {
            System.out.println("Я - первый поток");
            Thread.sleep(1000);
        }
    }
}