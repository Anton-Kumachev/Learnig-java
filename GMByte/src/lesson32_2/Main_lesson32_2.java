package lesson32_2;
//Пример реальнй синхронизации потоков (ключевое слово synchronized)

public class Main_lesson32_2 { //class SynTest - по уроку

    static int a = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread1 t1 = new Thread1();
        Thread t = new Thread(t1);
        t.start();

        for (int i = 0; i < 500000; i++) {
            increment1();
        }
        t.join(); // в момент вызова этого метода, поток Main остановится и будет ждать, пока выполнится
                  // поток Thread1
        System.out.println(a);
    }

    static synchronized void increment1() {
        a++;
    }

    static synchronized void increment2() { // при обращении к методу increment1() этот метод блокируется
        a++;
    }
}
