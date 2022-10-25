package Temp.Test14;

public class Cat {
    public void run() {
        System.out.println("Бег!");
    }
}

class Lion extends Cat {

    @Override
    public void run() {
        System.out.println("Лев бежит со скоростью 80 км/ч");
    }

    public void rest() {
        System.out.println("Львы любят отдыхать в саванне");
    }
}

class Tiger extends Cat {

    @Override
    public void run() {
        System.out.println("Тигр бежит со скоростью 60 км/ч");
    }
}

class Cheetah extends Cat {

    @Override
    public void run() {
        System.out.println("Гепард бежит со скоростью до 120 км/ч");
    }
}

class Aibolit {

    public void healCat(Cat cat) {

        System.out.println("Пациент здоров!");
        cat.run();
    }
}
