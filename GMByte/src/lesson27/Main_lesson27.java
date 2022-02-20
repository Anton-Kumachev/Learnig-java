package lesson27;

public class Main_lesson27 {
    public static void main(String[] args) {

        byte a = 5;
        System.out.println(a);

        if (5 == 5) {
            byte b = 5; //эту переменную видно только в пределах фигурных скобок
        }
        // System.out.println(b); - переменной b тут уже не видно
    }
}
