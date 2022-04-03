package lesson42_1;

public class Test {
    public static void main(String[] args) {
        int x = 1;
        int y = 1;
        System.out.println("Сравнение цифр: " + (x == 1));

        //     animal1  =>            {1}
        //     animal2  =>            {1}
        Animal animal1 = new Animal(1);
        Animal animal2 = new Animal(1);
        System.out.println("Сравнение объектов: " + (animal1.equals(animal2)));


    }
}

class Animal {
    private int id;

    public Animal(int id) {
        this.id = id;
    }
    //Для корерктного сравнения ссылочных переменных, нам необходимо переопределить метод equals():
    public boolean equals(Object obj) {
        Animal otherAnimal = (Animal) obj;
        return this.id == otherAnimal.id;
    }
}
