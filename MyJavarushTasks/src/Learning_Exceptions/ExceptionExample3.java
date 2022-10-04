package Learning_Exceptions;

/*Примеры проверяемых (checked) исключений*/
//Способ 1: просто пробрасываем исключение выше (вызывающему):

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionExample3 {
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException {
        method1();
    }

    public static void method1() throws FileNotFoundException, ClassNotFoundException
    {
        //тут кинется исключение  FileNotFoundException, такого файла нет
        FileInputStream fis = new FileInputStream("C2:\badFileName.txt");
    }
}
