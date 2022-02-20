package lesson24;

import java.io.IOException;
import java.util.Scanner;

public class Main_lesson24_2 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ваше имя:");
        String name = sc.next();

        System.out.println("Ваша фамилия:");
        String surname = sc.next();

        System.out.println(name + " " + surname);
    }
}
