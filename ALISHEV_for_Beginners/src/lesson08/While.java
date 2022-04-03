package lesson08;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value;
        do {
            System.out.println("Введите, пожалуйста, 5-ку!");
            value = scanner.nextInt();
        } while (value !=5);
        System.out.println("Отлично! Вы наконец-то прочитали внимательно и всё-таки ввели цифру: 5! Ура!");
    }
}
