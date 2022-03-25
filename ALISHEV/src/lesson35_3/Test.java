package lesson35_3;
//Анонимные классы
interface AbleToEat {
    public void eat();
}

class Animal implements AbleToEat {
    @Override
    public void eat() {
        System.out.println("asdfasfd");
    }
}

public class Test {
    public static void main(String[] args) {
        AbleToEat ableToEat = new Animal();
        ableToEat.eat();
    }
}
