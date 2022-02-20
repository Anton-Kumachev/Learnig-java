package lesson8;

public class Homework_lesson8 {
    public static void main(String[] args) {
        byte x = 7;
        method1(x);
    }

    static void method1 (byte a) {
        System.out.println("В качестве аргументов мне передали: " + (a + 5));
    }
}
