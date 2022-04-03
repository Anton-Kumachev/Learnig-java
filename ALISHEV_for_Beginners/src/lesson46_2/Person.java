package lesson46_2;

import java.io.Serializable;

public class Person implements Serializable { //Реализация этого интерфейса разрешает Java сериализовывать объекты класса Person
    private int id;
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
