package lesson05;

public class ForLoop {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            System.out.println("Hello " + i); // i++ == i = i + 1 (true)
        }
        System.out.println();
        for (int i = 5; i > 0; i--) {
            System.out.println("Hello " + i);
        }
    }
}
