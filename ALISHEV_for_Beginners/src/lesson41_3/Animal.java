package lesson41_3;

public abstract class Animal { //Это не конкретный класс(абстрактный), объекты которого не должны быть созданы
    public void eat() {
        System.out.println("I am eating..");
    }

    public abstract void makeSound(); //Создание абстрактного метода
}
