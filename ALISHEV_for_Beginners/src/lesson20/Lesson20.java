package lesson20;

public class Lesson20 {
    public static void main(String[] args) {
        Human human1 = new Human();
        System.out.println(human1.name);
        System.out.println(human1.age);
        Human human2 = new Human("Антон");
        Human human3 = new Human("Антон", 37);
    }
}

class Human {
    String name;
    int age;

    public Human() {
        this.name = "Имя по умолчанию";
        this.age = 0;
        System.out.println("Привет из первого конструктора!");
    }
    public Human(String name) {
        this.name = name;
        System.out.println("Привет из второго конструктора!");
    }
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Привет из третьего конструктора!");
    }


    public void setName(String myName) {
        this.name = myName;
    }
    public void setAge(int myAge) {
        this.age = myAge;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void getInfo() {
        System.out.println("Имя: " + name + ", " + "возраст: " + age);
    }


}
