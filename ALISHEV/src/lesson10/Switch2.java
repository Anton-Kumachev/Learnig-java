package lesson10;

import java.util.Scanner;

public class Switch2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите возраст:");
        String age = scanner.nextLine();
        switch(age) {
            case "ноль":
                System.out.println("ты родился!");
                break;
            case "семь":
                System.out.println("Ты пошёл в школу!");
                break;
                case "восемнадцать":
                System.out.println("Ты закончил школу!");
                break;
            default:
                System.out.println("Ни одно из условий не подошло.");
        }
    }
}
