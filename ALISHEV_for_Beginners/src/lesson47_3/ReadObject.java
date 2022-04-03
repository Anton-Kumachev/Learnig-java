package lesson47_3;

//Второй метод записывания массива в файл

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("people.bin"))) {
            Person person1 = (Person) ois.readObject();
            System.out.println(person1);
        } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) { //Это обработка исключения в случае, если мы пересылаем файл туда, где
                                                 //наш класс Person не создан
            e.printStackTrace();
        }
    }
}
