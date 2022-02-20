package lesson37;
import java.util.ArrayList;

public class Homework_less37 {
    public static void main(String[] args) {
        ArrayList<String> bc = new ArrayList<>();
        bc.add("Волга"); // ячейка коллекции [0]
        bc.add("Жигули"); // ячейка коллекции [1]
        bc.add("Лада"); // ячейка коллекции [2]
        bc.add("ВАЗ"); // ячейка коллекции [3]
        bc.add("УАЗ"); // ячейка коллекции [4]
        bc.add("Газель"); // ячейка коллекции [5]
        bc.add("Гранта"); // ячейка коллекции [6]
        bc.add("Приора"); // ячейка коллекции [7]
        bc.add("Ларгус"); // ячейка коллекции [8]
        bc.add("Веста"); // ячейка коллекции [9]

        System.out.println("1.");
        for (int i = 0; i < bc.size(); i++) {
            System.out.println(bc.get(i));
        }

        System.out.println("2.");
        bc.set(0, "Toyota");
        bc.set(1, "BMW");
        bc.set(2, "Subaru");
        bc.set(3, "Mitsubishi");
        bc.set(4, "KIA");
        for (int i = 0; i < 5; i++) {
            System.out.println(bc.get(i));
        }

        System.out.println("3.");
        bc.remove(0);
        bc.remove(1);
        bc.remove(7);
        bc.remove(6);
        for (int i = 0; i < bc.size(); i++) {
            System.out.println(bc.get(i));
        }

        System.out.println("4.");
        bc.add(3, "\"левая тачка\"");
        for (int i = 0; i < bc.size(); i++) {
            System.out.println(bc.get(i));
        }
    }
}
