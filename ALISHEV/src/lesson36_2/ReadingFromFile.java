package lesson36_2;

//Считывание из файла

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

import static java.io.File.separator;

public class ReadingFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        String separatior = separator;
        String path = "D:" + separator + "Anton" + separator + "IT" + separator + "Projects" + separator + "JAVA" + separator + "ALISHEV" + separator + "src" + separator + "lesson36_1" + separator + "test.txt";
        File file = new File(path);

        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        String[] words = line.split("0");
        System.out.println(Arrays.toString(words));
        scanner.close();
    }
}
