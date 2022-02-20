package lesson32;

import lesson20_1.T;

public class Main_lesson32 {
    public static void main(String[] args) throws InterruptedException {

        Thread1 t1 = new Thread1(); // Создание объекта второго потока
        Thread t = new Thread(t1); //Создание объекта первого(главного) потока

        t.start(); // запуск потока Thread1
        Thread.sleep(5);
        t1.b("Main ");
    }
}
