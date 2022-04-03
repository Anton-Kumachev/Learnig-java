package lesson37_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptions1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("asdf"); //Создание объекта, для работы с файлом
        Scanner scanner = new Scanner(file);

    }
}
