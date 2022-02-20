package lesson31_2;

public class MyThread extends Thread{ //Наследование от потока Thread
    
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Я - второй поток");
        }
    }
}
