package lesson39_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exception3 {
    public static void main(String[] args) {
       //Checked Exception(Compile time exception) - исключения, которые возникают во время компиляции и их нужно
      // обработать, иначе программа не скомпилируется
       File file = new File("asdf");
        try {
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) { //Обработка исключения на случай, если не обнаружен файл, который
                                           // необходимо обработать
            System.out.println("Файл asdf не обнаружен.");;
        }

    }
}
