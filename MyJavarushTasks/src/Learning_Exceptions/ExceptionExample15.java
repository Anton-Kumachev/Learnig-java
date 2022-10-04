package Learning_Exceptions;

//Код с использованием исключений

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionExample15 {

    public static void main(String[] args) throws IOException {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Username\\Desktop\\test.txt"));
            String firstString = reader.readLine();
            System.out.println(firstString);
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка, файл не найден!");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Ошибка при вводе/выводе данных из файла!");
            e.printStackTrace();
        }
    }
}
