package lesson47_1;

//Второй метод записывания массива в файл

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadObject {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("people.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Person person1 = (Person) ois.readObject();
            System.out.println(person1);

            ois.close();
        } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) { //Это обработка исключения в случае, если мы пересылаем файл туда, где
                                                 //наш класс Person не создан
            e.printStackTrace();
        }
    }
}
