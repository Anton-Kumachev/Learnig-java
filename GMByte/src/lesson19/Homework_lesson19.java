package lesson19;

public class Homework_lesson19 {

    public static void main(String[] args) {

        Car kiario = new KiaRio();

        kiario.speed = 90;
        kiario.name = "Kia Rio";
        kiario.color = "White";
        System.out.println("Моя оптимальная скрость: " + kiario.speed);
        System.out.println("Меня назвали: " + kiario.name);
        System.out.println("Мой естественный цвет: " + kiario.color);

        kiario.drive();
        kiario.light();
        kiario.stop();

        KiaRio kiaRioClear = new KiaRio();

        kiaRioClear.maxSpeed = 180;
        kiaRioClear.name = "Kia Rio (clear)";



    }
}
