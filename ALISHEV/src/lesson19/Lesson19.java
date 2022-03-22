package lesson19;

public class Lesson19 {
    public static void main(String[] args) {

        Human human1 = new Human();
        human1.setAge(37);
        human1.setName("Anton");
        human1.getInfo();

        Human human2 = new Human();
        human2.setAge(31);
        human2.setName("Liza");
        human2.getInfo();
    }
}

class Human {
    String name;
    int age;

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
