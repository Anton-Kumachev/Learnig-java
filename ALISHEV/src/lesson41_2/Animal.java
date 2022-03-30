package lesson41_2;

public abstract class Animal { //Это не конкретный класс(абстрактный), объект которого не должны быть созданы
    public void eat() {
        System.out.println("I am eating..");
    }

    public abstract void makeSound(); //Создание абстрактного метода
}
