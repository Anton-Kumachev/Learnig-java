package lesson26;

public class Test {
    public static void main(String[] args) {

        Animal animal = new Animal(1);
        Person person = new Person("Anton");
        animal.sleep();
        person.sayHello();

        animal.showInfo();
        person.showInfo();

        Info info1 = new Animal(1);
        Info info2 = new Person("Anton");
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
