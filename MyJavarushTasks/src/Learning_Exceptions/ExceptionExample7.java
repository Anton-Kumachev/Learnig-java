package Learning_Exceptions;

//Перехватываем оба – ничего не пробрасываем:

import java.io.FileNotFoundException;

import static Learning_Exceptions.ExceptionExample4.method1;

public class ExceptionExample7 {
    public static void method4()
    {
        try
        {
            method1();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("FileNotFoundException has been caught.");
        }
        catch (ClassNotFoundException e)
        {
            System.out.println("ClassNotFoundException has been caught.");
        }
    }
}
