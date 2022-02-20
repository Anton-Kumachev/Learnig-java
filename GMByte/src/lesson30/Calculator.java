package lesson30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите первое число:");
        String s1 = reader.readLine().trim(); // trim() - метод, который урезает пробелы в начале и в конце

        if (s1.isEmpty()) {
            System.out.println("Вы ввели пустое значение, программа остановлена, перезапустите программу");
        } else if (!s1.isEmpty() & s1 == null) {
            System.out.println("Вы ввели не число, программа остановлена, перезапустите программу ");
        } else {
            byte a = Byte.parseByte(s1);

            System.out.println("Введите знак операции:");
            String s = reader.readLine().trim();

            System.out.println("Введите второе число:");
            String s2 = reader.readLine();
            byte b = Byte.parseByte(s2);

            switch (s) {
                case "+":
                    System.out.println(a + b);
                    break;
                case "-":
                    System.out.println(a - b);
                    break;
                case "/":
                    System.out.println(a / b);
                    break;
                case "*":
                    System.out.println(a * b);
                    break;
                default:
                    System.out.println("Введён некорректный символ");
            }
        }
    }
}