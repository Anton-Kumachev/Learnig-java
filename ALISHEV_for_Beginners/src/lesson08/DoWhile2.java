package lesson08;

import java.util.Scanner;

public class DoWhile2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите, пожалуйста, цифру: 5");
        int value = scanner.nextInt();
        while(value !=5) {
            System.out.println("Нет, нет, нет же! Введите, пожалуйста, 5-ку!");
            value = scanner.nextInt();
        }
        System.out.println("Отлично! Вы наконец-то прочитали внимательно и всё-таки ввели цифру: 5! Ура!");
    }
}
