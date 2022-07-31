package Learning_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Example6_Collections_disjoint {
    public static void main(String[] args) {

        String mercury = new String("Меркурий");
        String venus = new String("Венера");
        String earth = new String("Земля");
        String mars = new String("Марс");
        String jupiter = new String("Юпитер");
        String saturn = new String("Сатурн");
        String uranus = new String("Уран");
        String neptune = new String("Нептун");

        ArrayList<String> solarSystemPart1 = new ArrayList<>(Arrays.asList(mercury, venus, earth, mars));
        ArrayList<String> solarSystemPart2 = new ArrayList<>(Arrays.asList(jupiter, saturn, uranus, neptune));

        System.out.println(Collections.disjoint(solarSystemPart1, solarSystemPart2));//будет true потому что все элементы разные

    }
}