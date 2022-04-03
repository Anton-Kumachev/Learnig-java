package lesson47_1;

import java.io.Serializable;

public class Person implements Serializable { //Реализация этого интерфейса разрешает Java сериализовывать объекты класса Person
    private transient int id; //Слово "transient" мы используем, если не хотим сериализовывать какое-то конкретное поле
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String toString() {
        return id + " : " + name;
    }


}
