package lesson24;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_lesson24 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Ваша имя?");
        String name = reader.readLine();
        System.out.println("Ваша фамилия?");
        String surname = reader.readLine();

        System.out.println(name + " " + surname);
    }
}
