package lesson5;

public class Homewor_lesson5_2 {
    public static void main(String[] args) {
        metod1();
        System.out.println("Ого! metod1() что-то вернул! Он вернул число: " + metod1());
        metod2();
        System.out.println("Ого! metod2() что-то вернул! Он вернул число: " + metod2());

        System.out.println("Числа из методов сложились и получилось: " + (metod1() + metod2()));
    }

        static byte metod1() {
        byte a = 5;
        byte b = 15;
        byte sum1 = (byte)(a + b);
        return  sum1;
        }

        static byte metod2() {
        byte c = 25;
        byte d = 35;
        byte sum2 = (byte)(c + d);
        return sum2;
        }
}