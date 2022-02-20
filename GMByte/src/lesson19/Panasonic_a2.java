package lesson19;

public class Panasonic_a2 extends Panasonic_a1 {

    byte contrast = 0;

    @Override
    void on() {
        System.out.println("Panasonic_a2 включился");
    }

    void pause() {
        System.out.println("Я на паузе");
    }

}
