package lesson35_3;

public class Dog {

    static String breedDog = "Сторожевая собака"; //Порода собаки
    static String colorDog = "Чёрный"; //Цвет собаки
    static int weight = 40; //Вес, кг
    static int maxSpeed = 5; //Максимальная скорость бега, м/с
    static int bodyLength = 60; //Длина тела, см

    static void bark() {
        System.out.println("Я могу лаять");
    }

    static void walkStreet() {
        System.out.println("Я могу гулять");
    }

    static void run() {
        System.out.println("Я могу быстро бегать");
    }

    static void eat() {
        System.out.println("Я могу есть мясо");
    }
}
