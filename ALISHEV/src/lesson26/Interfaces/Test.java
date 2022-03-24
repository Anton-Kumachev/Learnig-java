package lesson26.Interfaces;

public class Test {
    public static void main(String[] args) {

        Animal animal = new Animal(1);
        Person person = new Person("Anton");
        animal.sleep();
        person.sayHello();

        animal.showInfo(); //общий метод из интерфейса с разной реализацией для каждого класса
        person.showInfo(); //общий метод из интерфейса с разной реализацией для каждого класса

        Info info1 = new Animal(1); //Это Полиморфизм, так можно делать, потому что класс Animal
                                       //реализует интерфейс Info
        Info info2 = new Person("Anton"); //Это Полиморфизм, так можно делать, потому что класс
                                               // Person реализует интерфейс Info
        info1.showInfo();
        info2.showInfo();

        outputInfo(info1);
        outputInfo(info2);

        outputInfo(animal);
        outputInfo(person);
    }
    public  static void outputInfo(Info info) {
        info.showInfo();
    }

}
