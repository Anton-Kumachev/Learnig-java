package Learning_Exceptions;

//Обрабатываем одно исключение, второе – пробрасываем:

import java.io.FileNotFoundException;

import static Learning_Exceptions.ExceptionExample4.method1;

public class ExceptionExample6 {
    public static void method3() throws ClassNotFoundException
    {
        try
        {
            method1();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("FileNotFoundException has been caught.");
        }
    }
}
