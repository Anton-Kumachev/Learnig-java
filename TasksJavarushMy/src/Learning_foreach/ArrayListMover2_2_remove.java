package Learning_foreach;
import java.util.HashSet;
import java.util.Iterator;

public class ArrayListMover2_2_remove {
    public static void main(String[] args) {
        HashSet<String> namesHashSet = new HashSet<>();
        namesHashSet.add("Коля");
        namesHashSet.add("Петя");
        namesHashSet.add("Вася");
        namesHashSet.add("Маша");
        namesHashSet.add("Ира");
        namesHashSet.add("Вова");

        HashSet<String> namesHashSet2 = new HashSet<>(namesHashSet); //Элементы их коллекции namesHashSet помещаем в
                                                                     //коллекцию namesHashSet2, так мы можем удалять элементы

        System.out.println("Список с помощью цикла foreach:");

        for (String s : namesHashSet2) { //Цикл foreach, перебор идёт по копии первой коллекции
            if(s.charAt(0) == 'В') {
                namesHashSet.remove(s);
            }
            System.out.print(s + " ");
        }
        namesHashSet2 = null; //Отвязываем копию от нашей старой коллекции для предотвращения утечки памяти

        System.out.println();
        System.out.println();

        System.out.println("Список с помощью цикла с итератором:");
        Iterator iter = namesHashSet.iterator(); // Iterator - интерфейс
        while (iter.hasNext()) {
            String s = (String) iter.next();
            if (s.charAt(0) == 'В') {
                iter.remove();
            } else {
                System.out.print(s + " ");
            }
        }
    }
}