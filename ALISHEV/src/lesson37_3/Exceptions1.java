package lesson37_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptions1 {
    public static void main(String[] args) {
        try {
            readFile();
        } catch (FileNotFoundException e) {
            System.out.println("Обработка исключения в методе main.");
        }
    }
    public static void readFile() throws FileNotFoundException { //Пропишем отдельный метод для чтения файлов
        File file = new File("asdf"); //Создание объекта, для работы с файлом
        Scanner scanner = new Scanner(file);
    }
}
