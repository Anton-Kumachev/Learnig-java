package lesson36_3;

//Считывание из файла

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadingFromFile {
    public static void main(String[] args) throws FileNotFoundException { //Обработка исключения, если файл не найден
        File file = new File("test"); //Если файл лежит в корне нашего проекта(но не в том же пакете),
        // то можно просто указать название нашего файла, вместо длиннющего пути до него в ОС
        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine(); //Считываем строку
        String[] numbersString = line.split(" "); //метод split() разделяет строку, возвращая массив
        int[] numbers = new int[3];
        int counter = 0;

        for (String number : numbersString) {
            numbers[counter++] = Integer.parseInt(number); //Преобразует строку в число
        }
        System.out.println(Arrays.toString(numbers));

        scanner.close();//Закрываем поток
    }
}
