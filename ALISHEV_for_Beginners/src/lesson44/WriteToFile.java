package lesson44;

//Запись в файл

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteToFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("testFile");
        PrintWriter pw = new PrintWriter(file); //Класс PrintWriter предназначен только для записи строковых значений

        pw.println("Test row 1");
        pw.println("Test row 2");

        pw.close();
    }
}
