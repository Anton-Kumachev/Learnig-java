package lesson07;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите что-нибудь: ");
        String string = s.nextLine();
        System.out.println("Вы ввели: " + string);

        System.out.println("Введите какое-нибудь число: ");
        int x = s.nextInt();
        System.out.println("Вы ввели: " + x);
    }
}
