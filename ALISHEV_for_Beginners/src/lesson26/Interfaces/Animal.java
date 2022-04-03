package lesson26.Interfaces;

public class Animal implements Info { //Реализует все методы интерфейса Info, класс может реализовывать любое
                                      //количество интерфейсов
    public int id;

    public Animal(int id) { //конструктор
        this.id = id;
    }
    public void sleep() {
        System.out.println("I am sleeping");
    }
    public void showInfo() {
        System.out.println("Id is " + this.id);
    }
}
