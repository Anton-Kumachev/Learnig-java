package Learning_foreach;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class ArrayListMover2 {
    public static void main (String[] args) {
        HashSet<String> namesHashSet = new HashSet<>();
        namesHashSet.add("Коля");
        namesHashSet.add("Петя");
        namesHashSet.add("Вася");
        namesHashSet.add("Маша");
        namesHashSet.add("Ира");
        namesHashSet.add("Вова");

        System.out.println("Список с помощью цикла foreach:");

        for (String s : namesHashSet) { //Цикл foreach
            System.out.print(s + " ");
        }

        System.out.println();

        System.out.println("Список с помощью цикла с итератором:");
        Iterator iter = namesHashSet.iterator(); // Iterator - интерфейс
        while(iter.hasNext()) {
            String s = (String) iter.next();
            System.out.print(s + " ");
        }
    }
}