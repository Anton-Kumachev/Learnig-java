package lesson36_2;

//Считывание из файла

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import static java.io.File.separator;

public class ReadingFromFile {
    public static void main(String[] args) throws FileNotFoundException { //Обработка исключения, если
        String separator = File.separator; //Java автоматически определит принадлежность к ОС и
        //  файл не найден поставит слэш в нужную сторону, при указании пути до файла, для Windows и Linux они разные
        String path = "D:" + separator + "Anton" + separator + "IT" + separator + "Projects" +
                separator + "JAVA" + separator + "ALISHEV" + separator + "src" +
                separator + "lesson36_2" + separator + "test.txt";

        File file = new File(path); //Создание объекта, для работы с файлом
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
