package lesson35_3;

public class Bird {
    static String breedBird = "Птица"; //Тип объекта
    static int beakLength = 4; //Длина клюва, см
    static int wingSpan = 12; //Размах крыльев, см
    static int legLength = 5; //Длина ног, см
    static int featheringThickness = 2; //Толщина оперения, см
    static int weight = 1; //Вес, кг

    static void fly() {
        System.out.println("Я могу летать");
    }

    static void walk() {
        System.out.println("Я могу ходить");
    }

    static void swim() {
        System.out.println("Я могу плавать");
    }

    static void eat() {
        System.out.println("Я могу клевать зерно");
    }
}
