package lesson36_1;

//Считывание из файла

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static java.io.File.separator;

public class ReadingFromFile {
    public static void main(String[] args) throws FileNotFoundException { //Обработка исключения, если файл не найден
        String separator = File.separator; //Java автоматически определит принадлежность к ОС и
        // поставит слэш в нужную сторону, при указании пути до файла, для Windows и Linux они разные
        String path = "D:" + separator + "Anton" + separator + "IT" + separator + "Projects" +
                separator + "JAVA" + separator + "ALISHEV" + separator + "src" + separator +
                "lesson36_1" + separator + "test.txt";

        File file = new File(path); //Создание объекта, для работы с файлом
        Scanner scanner = new Scanner(file);
        while(scanner.hasNextLine()) { //Цикл будет выполняться до тех пор, пока в файле есть строки
            System.out.println(scanner.nextLine());
        }
        scanner.close(); //Закрываем поток
    }
}
