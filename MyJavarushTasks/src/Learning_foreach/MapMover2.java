package Learning_foreach;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapMover2 {
    public static void main (String[] args) {
        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> surnames = new ArrayList<>();
        names.add("Коля");
        names.add("Петя");
        names.add("Вася");
        names.add("Маша");
        names.add("Ира");
        names.add("Вова");

        surnames.add("Николаев");
        surnames.add("Петров");
        surnames.add("Васильев");
        surnames.add("Машкина");
        surnames.add("Иринова");
        surnames.add("Владимиров");

        Iterator iterNames = names.iterator();
        Iterator iterSurnames = surnames.iterator();

        /*while (iterNames.hasNext()) {
            while (iterSurnames.hasNext()) {
                System.out.println(iterNames.next() + " " + iterSurnames.next());
            }
        }*/

        for (String surname : surnames) {
            for (String name : names) {
                System.out.println(name + " " + surname);
            }
        }
    }
}