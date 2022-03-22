package lesson17;

public class ClassesAndObjects4 {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.age = 50;
        person1.speak();
        person1.setName("Роман");
        String s1 = "Вова";

        Person person2 = new Person();
        person2.setNameAndAge(s1, 20);
        person2.age = 20;
        person2.speak();
    }
}

class Person {
    String name;
    int age;

    void setName(String username) {
        name = username;
    }
    void setNameAndAge(String username, int userage) {
        name = username;
        age = userage;
    }
    int calculateYearsToRetirement(){
        int years = 65 - age;
        return years;
    }

    void speak() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Меня зовут " + name + ", " + "мне " + age + " лет.");
        }
    }
    void sayHello() {
        System.out.println("Привет!");
    }
}

