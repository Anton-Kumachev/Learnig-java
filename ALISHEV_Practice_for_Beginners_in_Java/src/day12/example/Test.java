package day12.example;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Doll> dollList = new ArrayList<>();
        dollList.add(new Doll("Barbie", "Mattel"));
        dollList.add(new Doll("Princess", "Hasbro"));

        Girl girl = new Girl("Mary", 12, dollList);

        //Код можно немного упростить с помощью метода Arrays.asList():
       /* Girl girl = new Girl("Mary", 12,
        Arrays.asList(new Doll("Barbie", "Mattel"), new Doll("Princess", "Hasbro")));*/

        //Вывод имен кукол девочки на экран с помощью цикла for each (в классе Doll
        //был добавлен геттер на поле name):
        System.out.println("Список кукол:");
        for (Doll doll : girl.getDolls()) {
            System.out.println(doll.getName());
        }
    }
}
