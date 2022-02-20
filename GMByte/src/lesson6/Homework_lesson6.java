package lesson6;

public class Homework_lesson6 {
    public static void main(String[] args) {

        Bird bird = new Bird();
        System.out.println("Мой вес: " + bird.weight);
        System.out.println("Мой размах крыльев: " + bird.wings);
        System.out.println("Моя максимальная скорость полёта: " + bird.maxFlightSpeed);
        System.out.println("Моя максимальная высота полёта: " + bird.maxHeightFly);

        bird.fly();
        bird.walk();
        bird.eat();
        bird.eggs();
    }
}
