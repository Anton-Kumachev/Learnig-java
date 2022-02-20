package lesson39;
// Уроки Java - №39 Exceptions ч.2

public class Main_lesson39 {
    public static void main(String[] args) {

        try {
            Object o = new Object();
            o.toString();

            int i = 7 / 0;

            int[] array = new int[10];

            System.out.println(array[10]);

            System.out.println("Я закончил без ошибки");
        } catch (NullPointerException | ArithmeticException ex) {
            System.out.println("Какая-то ошибка");
        } catch(Exception ex) { // при запуске этого блока с общим Exception первым все остальные catch(.... ex) - не нужны
            System.out.println("Прошу инициализировать переменные");
        }
    }
}
