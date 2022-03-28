package lesson37_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptions1 {
    public static void main(String[] args) {
        File file = new File("test2"); //Создание объекта, для работы с файлом

        try { //Между скобками находится код, который может выдать исключение
            Scanner scanner = new Scanner(file);
            System.out.println("После scanner'a");
        } catch (FileNotFoundException e) { //Здесь между скобками находится обработка исключения,
                                            //можно реализовать
            //e.printStackTrace(); //- вместо этого пишем свой метод обработки исключения:
            System.out.println("Файл не найден");
        }
        System.out.println("После блока try catch");
    }
}
