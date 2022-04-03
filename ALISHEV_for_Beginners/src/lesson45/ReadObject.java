package lesson45;

import java.io.*;

public class ReadObject {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("people.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Person person1 = (Person) ois.readObject(); //Тут мы обязательно делаем даункастинг до класса Person
            Person person2 = (Person) ois.readObject(); //Тут мы обязательно делаем даункастинг до класса Person

            System.out.println(person1);
            System.out.println(person2);

            ois.close();
        } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) { //Это обработка исключения в случае, если мы пересылаем файл туда, где
                                                 //наш класс Person не создан
            e.printStackTrace();
        }
    }
}
