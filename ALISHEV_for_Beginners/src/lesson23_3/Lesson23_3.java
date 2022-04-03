package lesson23_3;

public class Lesson23_3 {
    public static void main(String[] args) {
        System.out.printf("%f This is %s a string, %d \n", 10.4, "NICE", 10000);
        System.out.printf("String %10d \n", 532); //число знаков слева от цифы
        System.out.printf("String %10d \n", 5);//число знаков слева от цифы
        System.out.printf("String %10d \n", 1000000000);//число знаков слева от цифы
        System.out.printf("String %d \n", 532);//число знаков слева от цифы
        System.out.printf("String %10d \n", 5);//число знаков слева от цифы
        System.out.printf("String %-10d \n", 50);//число знаков справа от цифы
        System.out.printf("String %d \n", 1000000000);
        System.out.printf("String %.2f \n", 45.32265);//округление
        System.out.printf("String %.2f \n", 45.33754);//округление
        System.out.printf("String %.2f \n", 45.327652636);//округление

    }
}