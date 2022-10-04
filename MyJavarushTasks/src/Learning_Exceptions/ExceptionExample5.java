package Learning_Exceptions;

//Не обрабатываем исключения – нужно пробросить их дальше, тому, кто знает как

import java.io.FileNotFoundException;

import static Learning_Exceptions.ExceptionExample4.method1;

public class ExceptionExample5 {
    public static void method2() throws FileNotFoundException, ClassNotFoundException
    {
        method1();
    }
}
