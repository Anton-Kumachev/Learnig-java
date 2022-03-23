package lesson23_1;

public class Lesson23_1 {
    public static void main(String[] args) {
        String s = "Hello"; //String immutable класс не изменяемый, объект каждый раз создаётся новый
        s = s.toUpperCase();
        System.out.println(s);

        String string1 = "Hello";
        String string2 = " my";
        String string3 = " friend";
        String stringAll = string1 + string2 + string3;
        System.out.println(stringAll);

    }
}