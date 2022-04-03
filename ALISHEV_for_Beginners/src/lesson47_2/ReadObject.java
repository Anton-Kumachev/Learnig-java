package lesson47_2;

//������ ����� ����������� ������� � ����

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

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
            } catch (ClassNotFoundException e) { //��� ��������� ���������� � ������, ���� �� ���������� ���� ����, ���
                                                 //��� ����� Person �� ������
            e.printStackTrace();
        }
    }
}
