package Temp.Test14;
//https://javarush.ru/groups/posts/1974-praktika-ispoljhzovanija-polimorfizma

//Практика использования полиморфизма

public class Main {
    public static void main(String[] args) {

        Aibolit aibolit = new Aibolit();

        Lion simba = new Lion();
        Tiger sherekhan = new Tiger();
        Cheetah chester = new Cheetah();

        aibolit.healCat(simba);
        aibolit.healCat(sherekhan);
        aibolit.healCat(chester);

        simba.rest();

        //Интересный момент, если:
        Cat catLion = new Lion();
        catLion.run(); //Метод rest() уже тут не доступен
    }
}
