package lesson21_2;

public class Lesson21_2 {
    public static void main(String[] args) {
        Human h1 = new Human("Anton", 37);
        Human h2 = new Human("Liza", 31);
        h1.printNumberOfPeople();
        h2.printNumberOfPeople();

        Human h3 = new Human("Mark", 9);
        Human h4 = new Human("Sofia", 4);
        h3.printNumberOfPeople();
        h4.printNumberOfPeople();
    }
}

class Human {
    private String name;
    private int age;

    public static int countPeople; // countPeople = 0

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        countPeople++;
    }

    public void setName(String myName) {
        this.name = myName;
    }
    public void setAge(int myAge) {
        this.age = myAge;
    }

    public static void printNumberOfPeople() {
        System.out.println("Number of people is " + countPeople);
    }
}
