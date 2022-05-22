package Temp;

public class Test16 {
    public static void main(String[] args) {
        printNumbers(10);
    }

    public static void printNumbers(int firstNumber) {
        var i = firstNumber;

        while (i >= 1) {
            System.out.println(i);
            i = i - 1;
        }
        System.out.println("finished!");
    }
}


