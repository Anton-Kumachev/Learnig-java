package Learning_Recursion;

//Рекурсивное решение

public class Test3_factorial {
    public static void main(String[] args) {
        System.out.println(getFactorial(0)); //0!
        System.out.println(getFactorial(1)); //1!
        System.out.println(getFactorial(2)); //2!
        System.out.println(getFactorial(3)); //3!
        System.out.println(getFactorial(4)); //4!
        System.out.println(getFactorial(5)); //5!
    }
    public static int getFactorial(int f) {
        if (f <= 1) {
            return 1;
        }
        else {
            return f * getFactorial(f - 1); //Рекурсия
        }
    }
}
