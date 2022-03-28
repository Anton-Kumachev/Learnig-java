package lesson38_1;

import java.io.IOException;
import java.util.Scanner;

public class Exception2 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            int x = Integer.parseInt(scanner.nextLine()); //Перевод строкового типа введёных данных в int
            if(x !=0) {
                try {
                    throw new IOException(); //Если пользователь ввёл не 0, то выбрасываем исключение
                } catch (IOException e) {
                    System.out.println("Пользователь ввёл что-то кроме нуля.");
                }
            }
        }
    }
}
