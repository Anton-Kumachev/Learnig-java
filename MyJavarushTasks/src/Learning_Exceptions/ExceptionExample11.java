package Learning_Exceptions;

//Код с использованием исключений

public class ExceptionExample11 {

    public static void main(String[] args) {
        try
        {
            System.out.println("Before method1 calling.");
            int a = 1/0;
            System.out.println("After method1 calling. Never will be shown.");
        }
        catch (NullPointerException e)
        {
            System.out.println("Reference is null. Exception has been caught.");
        }
    }
}
