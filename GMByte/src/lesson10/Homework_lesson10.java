package lesson10;
import org.w3c.dom.ls.LSOutput;

public class Homework_lesson10 {

    public static void main(String[] args) {

        Test test = new Test((byte)5,2000,4000,29.2);

        System.out.println("Я новый класс - Test! Меня создали!");
        System.out.println(test.a);
        System.out.println(test.b);
        System.out.println(test.c);
        System.out.println(test.d);
    }

}
