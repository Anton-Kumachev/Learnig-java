package lesson35_4;
//Анонимные классы
interface AbleToEat {
    public void eat();
}
public class Test {
    public static void main(String[] args) {
        AbleToEat ableToEat = new AbleToEat() { // Создание объект интерфейса через анонимный класс
            @Override
            public void eat() {
                System.out.println("Someone is eating...");
            }
        };
        ableToEat.eat();
    }
}
