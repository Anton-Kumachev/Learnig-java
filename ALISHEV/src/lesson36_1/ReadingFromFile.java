package lesson36_1;

//Считывание из файла

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static java.io.File.separator;

public class ReadingFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        String separatior = separator;
        String path = "D:" + separator + "Anton" + separator + "IT" + separator + "Projects" + separator + "JAVA" + separator + "ALISHEV" + separator + "src" + separator + "lesson36_1" + separator + "test.txt";
        File file = new File(path);

        Scanner scanner = new Scanner(file);
        while(scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }
}
