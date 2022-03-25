package lesson34_1;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Animal> listOfAnimal = new ArrayList<>();
        listOfAnimal.add(new Animal(1));
        listOfAnimal.add(new Animal(2));

        test(listOfAnimal);
    }
    private static void test(List<Animal> list) {
        for(Animal animal : list) {
            System.out.println(animal);
        }
    }
}
