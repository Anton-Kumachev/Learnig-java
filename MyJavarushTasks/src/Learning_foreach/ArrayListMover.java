package Learning_foreach;
import java.util.ArrayList;

public class ArrayListMover {
    public static void main (String[] args) {
        ArrayList<String> namesArrayList = new ArrayList<>();
        namesArrayList.add("Коля");
        namesArrayList.add("Петя");
        namesArrayList.add("Вася");
        namesArrayList.add("Маша");
        namesArrayList.add("Ира");
        namesArrayList.add("Вова");

        System.out.println("Список из обычного цикла for:");

        for (int i = 0; i < 6; i++) {
            String s = namesArrayList.get(i);
            System.out.print(s + " ");
        }
        System.out.println(" ");

        System.out.println(" "); //Пропуск строки

        System.out.println("Список с помощью цикла foreach:");

        for (String s : namesArrayList) { //Цикл foreach
            System.out.print(s + " ");
        }
    }
}