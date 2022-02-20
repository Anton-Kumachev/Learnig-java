package lesson38;
// Уроки Java - №38 Exceptions ч.1

public class Main_lesson38 {
    public static void main(String[] args) {

        try {
            Object o = new Object();
            o.equals("");

            int i = 7 / 0;
            System.out.println("Я закончил без ошибки");
        } catch(RuntimeException ex) {
            System.out.println("Какая-то ошибка");
        } catch(Exception ex) { // при запуске этого блока с общим Exception первым все остальные catch(.... ex) - не нужны
            System.out.println("Прошу инициализировать переменные");
        }
    }
}
