package Learning_Exceptions;

//Код с использованием исключений

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionExample16 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Username\\Desktop\\test.txt"));
            String firstString = reader.readLine();
            System.out.println(firstString);
    }
}
