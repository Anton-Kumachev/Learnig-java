package Learning_Recursion;

public class Test2_factorial {
    public static void main(String[] args) {
        System.out.println(factorial(0)); //0!
        System.out.println(factorial(1)); //1!
        System.out.println(factorial(2)); //2!
        System.out.println(factorial(3)); //3!
        System.out.println(factorial(4)); //4!
        System.out.println(factorial(5)); //5!
    }
        public static int factorial (int f){
            if (f <= 1) {
                return 1;
            } else {
                 return f * factorial(f - 1);
        }
    }
}