package lesson47_2;

import java.io.Serializable;

public class Person implements Serializable { //Реализация этого интерфейса разрешает Java сериализовывать объекты класса Person
    private static final long serialVersionUID = -9042488572989692565L; //При изменении класса Person и добавлении новых
                                                                        //полей класса нужно менять serialVersionUID
    private int id;
    private String personName;
    private int age;
    private byte type;

    public Person(int id, String name) {
        this.id = id;
        this.personName = name;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return personName;
    }
    public String toString() {
        return id + " : " + personName;
    }


}
