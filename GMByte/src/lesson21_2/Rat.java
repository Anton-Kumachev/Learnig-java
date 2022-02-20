package lesson21_2;

public class Rat implements Mouse {
    @Override
    public void mouseSound() {
        System.out.println("Пи-пи-пи цок-цок-цок!");
    }

    @Override
    public void run() {
        System.out.println("Я бегаю быстрее кошки!");
    }

    @Override
    public void eatCheese() {
        System.out.println("Любовь к сыру у меня в крови!");
    }
}
