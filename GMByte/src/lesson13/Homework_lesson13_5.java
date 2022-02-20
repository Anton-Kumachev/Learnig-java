package lesson13;

public class Homework_lesson13_5 {
    public static void main(String[] args) {
        int x = 7;

        do {
            x = x + 3;
            if (x <= 50) {
                System.out.println(x);
            } else break;
        } while (x < 50);
    }
}

