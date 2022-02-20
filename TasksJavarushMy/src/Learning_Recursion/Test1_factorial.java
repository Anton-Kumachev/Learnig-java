package Learning_Recursion;

public class Test1_factorial {
    public static void main(String[] args) {
        System.out.println(getFactorial(0)); //0!
        System.out.println(getFactorial(1)); //1!
        System.out.println(getFactorial(2)); //2!
        System.out.println(getFactorial(3)); //3!
        System.out.println(getFactorial(4)); //4!
        System.out.println(getFactorial(5)); //5!
    }
        public static int getFactorial (int f){
            int result = 1;
            for (int i = 1; i <= f; i++) {
                result = result * i;
            }
            return result;
    }
}

