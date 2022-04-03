package lesson47_2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
        Person person1 = new Person(1, "Anton");

        try {
            FileOutputStream fos = new FileOutputStream("people.bin"); //Когда мы записываем бинарные данные
                                                                             //в файл расширение обычно указывают .bin
            ObjectOutputStream oos = new ObjectOutputStream(fos); //Предназначен для записи объектов в файл

            oos.writeObject(person1);
            oos.close(); //Всегда, когда мы используем входной поток данных, мы должны его закрывать с помощью метода close()
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
