package lesson41_3;

public class Dog implements AbleToMakeSound { //Реализация интерфейса AbleToMakeSound
    @Override
    public void makeSound() {
        System.out.println("bark-bark");
    }
}
