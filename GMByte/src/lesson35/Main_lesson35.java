package lesson35;

public class Main_lesson35 {
    public static void main(String[] args) {

    Object obj = new String(); // Не важно какого типа указатель Object obj, важно какого типа объект new String()
    if (obj instanceof String) {
        System.out.println("Объект создан по классу String");
    } else {
        System.out.println("Нет");
    }

    }
}
