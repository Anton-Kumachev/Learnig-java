package lesson39_2;
// Уроки Java - №39 Exceptions ч.2

public class Main_lesson39_2 {
    public static void main(String[] args) {
        System.out.println(test(2));
    }

    public static int test(int i) {

        if (i == 0) {
            throw new NullPointerException();
        }

        int a = 5 / i;
        return a;
    }
}