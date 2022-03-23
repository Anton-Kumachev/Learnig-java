package lesson21_1;

public class Lesson21_1 {
    public static void main(String[] args) {
        Human h1 = new Human("Anton", 37);
        Human h2 = new Human("Liza", 31);
        Human.description = "Nice";
        Human.getDescription();
        h1.getAllFields();
        h2.getAllFields();
        Human.description = "Good";
        h1.getAllFields();
        h2.getAllFields();
    }
}

class Human {
    private String name;
    private int age;

    public static String description;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String myName) {
        this.name = myName;
    }
    public void setAge(int myAge) {
        this.age = myAge;
    }

    public static void  getDescription() {
        System.out.println(description);
    }
    public void getAllFields() {
        System.out.println(name + ", " + age + ", " + description);
    }
}
