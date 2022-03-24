package lesson31;

public class Test {
    public static void main(String[] args) {
        int x = 1;
        System.out.println(x);
        //Классы обёртки:
        // Double. Float, Long, Integer, Short, Byte, Charapter and Boolean
        Integer x2 = new Integer(123);
        Integer.parseInt("123"); //Этот метод выделяет число из nb==типа String

        Integer x3 = 123; //"Это равносильно выражению ниже:
        Integer x4 = new Integer(123);
        int y = x3;
    }
}
