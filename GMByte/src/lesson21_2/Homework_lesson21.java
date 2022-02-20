package lesson21_2;

public class Homework_lesson21 {

    public static void main(String[] args) {

        Rat splinter = new Rat();
        splinter.mouseSound();
        splinter.run();
        splinter.eatCheese();

        System.out.println("");

        Mouse miky = new Rat(); //создание объекта с применением принципа полиморфизма
        splinter.mouseSound();
        splinter.run();
        splinter.eatCheese();
    }
}
