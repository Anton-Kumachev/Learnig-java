package lesson24;

class Human {
    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }
//Переопределение метода toString();
    public String toString() {
        return  name + ", " + age;
    }
}
