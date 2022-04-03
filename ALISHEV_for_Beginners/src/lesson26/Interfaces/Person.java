package lesson26.Interfaces;

public class Person implements Info { //Реализует все методы интерфейса Info, класс может реализовывать любое
                                      //количество интерфейсов
    public String name;

    public Person(String name) { //конструктор
        this.name = name;
    }
    public void sayHello() {
        System.out.println("Hello");
    }
    public void showInfo() {
        System.out.println("Name is " + this.name);
    }
}
