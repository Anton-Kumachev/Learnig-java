package day05;

/*2.Создать класс Мотоцикл (англ. Motorbike), с  полями “Год выпуска”, “Цвет”,
    “Модель”. Создать экземпляр класса Мотоцикл, с помощью конструктора (сеттеры не
    использовать). Придерживаться принципов инкапсуляции и использовать ключевое
    слово this. Геттером получить год выпуска, цвет, модель, вывести значения в
    консоль. */

public class Task2 {
    public static void main(String[] args) {
        Motorbike motorbike = new Motorbike(2010, "Kawasaki", "red");
        System.out.println("model: " + motorbike.getModel() + "\n" + "year: " + motorbike.getYear() + "\n"
                + "color: " + motorbike.getColor());
    }
}
