package lesson33;

//Введение в параметризацию(Generics)

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
    //Как было в Java 5:
        List animals =new ArrayList();
        Animal ourAnimal = new Animal();
        animals.add("cat");
        animals.add("dog");
        animals.add("frog");
        animals.add(ourAnimal);

        String animal0 =(String)animals.get(0);
        String animal1 =(String)animals.get(1);
        String animal2 =(String)animals.get(2);
        System.out.println(animal0);
        System.out.println(animal1);
        System.out.println(animal2);

    //С появлением дженериков(Generics):
        List<String> animals2 = new ArrayList<String>();
        animals2.add("cat2");
        animals2.add("dog2");
        animals2.add("frog2");
        //animals2.add(ourAnimal); - Java не даст нам поместит в динамический переменную другого типа
        String animal4 = animals2.get(1);
        System.out.println(animal4);

    //Java 7:
        List<String> animals3 = new ArrayList<>();
    }
}

class Animal {
}