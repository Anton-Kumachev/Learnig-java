package Learning_Exceptions;

/*Примеры проверяемых (checked) исключений*/
//Способ 2: перехватываем исключение:

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionExample4 {
    public static void main(String[] args)
    {
        try
        {
            method1();
        }
        catch(Exception e)
        {
        }
    }

    public static void method1() throws FileNotFoundException, ClassNotFoundException
    {
        //тут кинется исключение  FileNotFoundException, такого файла нет
        FileInputStream fis = new FileInputStream("C2:\badFileName.txt");
    }
}
